package Acciones;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author kevinvsequeira
 */
public class Funciones {

    public ResultSet consultaCliente(String cedula) {
        ResultSet myRs = null;
        Clientes.Cliente c = new Clientes.Cliente(cedula);
        try {
            Principal.DBConnection db = new Principal.DBConnection();
            java.sql.Connection conn = db.connect();
//                System.out.println("Gotit1");
            Statement myStmt = conn.createStatement();
//                System.out.println("Gotit2");
            String sql = "SELECT cedula, nombre, apellido1, apellido2, banco, moneda, saldo"
                    + " from clientes where cedula = " + cedula + "";
//                System.out.println("SQL: "+sql);
//                int result = 
            myRs = myStmt.executeQuery(sql);
//                System.out.println("RS: "+myRs.getString("Cedula"));
            if (myRs.next() == false) {
//                    System.out.println("ResultSet in empty in Java");
                return null;
            } else {
//                    System.out.println("Ced: "+myRs.getString("Cedula"));
                return myRs;
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return myRs;
    }

    public boolean cargaLog(String remi, String desti, String log) {
        try {
            Principal.DBConnection db = new Principal.DBConnection();
            java.sql.Connection conn = db.connect();
//                System.out.println("Gotit1");
            Statement myStmt = conn.createStatement();
//                System.out.println("Gotit2");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String date = dtf.format(now);
            String sql = "INSERT into transactions (senderID, receiverID, detail, date) VALUES ('" + remi + "','" + desti + "',"
                    + "'" + log + "','" + date + "')";
            System.out.println("SQL: " + sql);
//                int result = 
            return (myStmt.executeUpdate(sql) == 2);
//                System.out.println("Gotit3");
//                return myStmt.executeUpdate(sql);

//                while(myRs.next()){
//                    System.out.println(myRs.getString("Cedula"));
//                }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return false;
    }

    public ResultSet validaMonto(String cedula, int monto) {
        String[] resul = new String[8];
        ResultSet myRs = null;
        Clientes.Cliente c = new Clientes.Cliente(cedula);
        try {
            Principal.DBConnection db = new Principal.DBConnection();
            java.sql.Connection conn = db.connect();
//                System.out.println("Gotit1");
            Statement myStmt = conn.createStatement();
//                System.out.println("Gotit2");
            String sql = "SELECT cedula, nombre, apellido1, apellido2, banco, moneda, saldo"
                    + " from clientes where cedula = " + cedula + "";
//                System.out.println("SQL: "+sql);
//                int result = 
            myRs = myStmt.executeQuery(sql);
            System.out.println("1");
            System.out.println("RS> " + myRs.getString("Saldo"));
            System.out.println("2");
            if (myRs.next() == false) {
//                    System.out.println("ResultSet in empty in Java");
                return null;
            } else {
//                    System.out.println("Ced: "+myRs.getString("Cedula"));
                return myRs;
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return myRs;
    }

    public boolean realizaTranferencia(String idCliente, double montoCliente,
            String idDestinatario, double montoDestinatario) {
//        System.out.println("Cuenta #"+idCliente + " <> " + montoCliente +
//                "Cuenta #"+idDestinatario+" <> "+montoDestinatario);
        Boolean retorno = null;
        int sqlCliente = 0;
        int sqlDestinatario = 0;
        try {
            Principal.DBConnection db = new Principal.DBConnection();
            java.sql.Connection conn = db.connect();
//                System.out.println("Gotit1");
            Statement myStmt = conn.createStatement();
//                System.out.println("Gotit2");
//                UPDATE clientes set Saldo = Saldo+50000 where Cedula = 2
            String sql = "UPDATE clientes set Saldo = Saldo+" + montoCliente + " where"
                    + " Cedula = " + idCliente;
//                System.out.println("SQL Cliente: "+sql);
//                int result = 
            sqlCliente = myStmt.executeUpdate(sql);

            if (sqlCliente == 0) {
                System.out.println("ResultSet is empty in Java");
                return false;
            } else {
//                    System.out.println("Ced: "+myRs.getString("Cedula"));
                retorno = true;
            }

            sql = "UPDATE clientes set Saldo = Saldo+" + montoDestinatario + " where"
                    + " Cedula = " + idDestinatario;
//                System.out.println("SQL Cliente: "+sql);
//                int result = 
            sqlDestinatario = myStmt.executeUpdate(sql);

            if (sqlDestinatario == 0) {
                System.out.println("ResultSet in empty in Java");
                retorno = false;
            } else {
//                    System.out.println("Ced: "+myRs.getString("Cedula"));
                retorno = true;
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return retorno;
    }
}
