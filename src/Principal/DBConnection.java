package Principal;

import java.sql.DriverManager;

public class DBConnection {
    
    public static java.sql.Connection connect(){
        java.sql.Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        } catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }
    
    
}
