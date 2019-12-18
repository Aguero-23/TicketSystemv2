package Clientes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Funciones {
    
    public int ingresaCliente(String cedula, String nombre, String ape1, String ape2,
            String banco, String moneda, String saldo, String creacion) {
//            System.out.println("Gotit");
            
            try{
                Principal.DBConnection db = new Principal.DBConnection();
                java.sql.Connection conn = db.connect();
//                System.out.println("Gotit1");
                Statement myStmt = conn.createStatement();
//                System.out.println("Gotit2");
                String sql = "INSERT into clientes (Cedula, Nombre, Apellido1, Apellido2,"
                    + " Banco, Moneda, Saldo, Fecha_Creacion) VALUES ('"+cedula+"','"+nombre+"',"
                + "'"+ape1+"','"+ape2+"','"+banco+"','"+moneda+"','"+saldo+"','"+creacion+"')";
//                System.out.println("SQL: "+sql);
//                int result = 
//                ResultSet myRs = myStmt.executeQuery(sql);
//                System.out.println("Gotit3");
                return myStmt.executeUpdate(sql);

//                while(myRs.next()){
//                    System.out.println(myRs.getString("Cedula"));
//                }
            }catch(Exception exc){
                exc.printStackTrace();
            }
            return 0;
    }
    
    public ResultSet consultaCliente(String cedula) {
//            System.out.println("Gotit");
            String[] resul = new String[8];
            ResultSet myRs = null;
            Clientes.Cliente c = new Clientes.Cliente(cedula);
            try{
                Principal.DBConnection db = new Principal.DBConnection();
                java.sql.Connection conn = db.connect();
//                System.out.println("Gotit1");
                Statement myStmt = conn.createStatement();
//                System.out.println("Gotit2");
                String sql = "SELECT * from clientes where cedula = "+cedula+"";
                System.out.println("SQL: "+sql);
//                int result = 
                myRs = myStmt.executeQuery(sql);
                
                if (myRs.next() == false) {
                    System.out.println("ResultSet in empty in Java");
                    return null;
                }else{
                    System.out.println("Ced: "+myRs.getString("Cedula"));
                    return myRs;
                }
            }catch(Exception exc){
                exc.printStackTrace();
            }
            return myRs;
    }
    
    public boolean eliminaCliente(String cedula){
            boolean ret = false;
            try{
                Principal.DBConnection db = new Principal.DBConnection();
                java.sql.Connection conn = db.connect();
//                System.out.println("Gotit1");
                Statement myStmt = conn.createStatement();
//                System.out.println("Gotit2");
                String sql = "DELETE from clientes where cedula = "+cedula+"";
                System.out.println("SQL: "+sql);
//                int result = 
                if(myStmt.executeUpdate(sql) !=0){
                    return true;
                }else {
                    return false;
                }
            }catch(Exception exc){
                exc.printStackTrace();
            }
            return ret;
    }
    
}
