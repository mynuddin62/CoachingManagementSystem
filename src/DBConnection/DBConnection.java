/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Al-Amin
 */
public class DBConnection {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/tcms", "root", "1234");
        } catch (Exception e) {
            return null;
        }
    }
}
