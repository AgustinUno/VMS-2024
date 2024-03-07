
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Main
 */
public class ConnectToDB {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "vaccinemanagementsystem";
    private static Integer portnumber  = 3306;
    private static String password = "";
    
    public static java.sql.Connection getConnection(){
        java.sql.Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
            System.out.println("Connected Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection Failed");
        }
        
        
        return cnx;
    }
}
