/*
day la thu vien, tao doi tuong ket noi (Connection) giua ung dung Java va CSDL SQLServer 
 */
package mylib;

import java.sql.*;

public class MyConnection {
    
    public static String user = "sa";
    public static String password = "123";
    public static String url = 
    "jdbc:sqlserver://localhost:1433;encrypt=true;databaseName=db2303_M0;trustServerCertificate=true;";
        
    public static Connection getConnect(){
        Connection cn = null;
        
        try {
            //1.nap driver JDBCs
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            //2.tao ket noi den CSDL 
            cn = DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(" >>Loi: "+ ex.getMessage());
        }
        
        return cn;
    }
    
    
    public static void main(String[] args) {
        MyConnection.getConnect();
    }
}
