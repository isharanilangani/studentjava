import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class databaseconnection {
    static Connection connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment","root","");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
