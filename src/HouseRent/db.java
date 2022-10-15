/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HouseRent;
import java.sql.*;

/**
 *
 * @author ae
 */
public class db {
    public static Connection mycon () {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}
