package com.imaginarycode.minecraft.redisbungee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class addServerToDB {
    
    public static void addServerToDB(String url, String SQLuser, String SQLpassword, String serverIP) {

        //String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        //String user = "testuser";
        //String password = "test623";
        
        String sql = "INSERT INTO Servers(Name) VALUES(?)";

        try (Connection con = DriverManager.getConnection(url, SQLuser, SQLpassword);
                PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, serverIP);
            pst.executeUpdate();
            
            System.out.println("A new server has been inserted");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(PreparedStatement.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }
}