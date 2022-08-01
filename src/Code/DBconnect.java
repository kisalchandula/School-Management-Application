/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.sql.*;

/**
 *
 * @author kisal
 */
public class DBconnect {
    public static Connection connect (){
        Connection conn = null;
        
            String url,user,pass;
            //values
            url = "jdbc:mysql://localhost:3306/schoolmanage?userSSL=true";
            user = "root";
            pass = "";
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Driver loaded");
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return conn;
    }
}
