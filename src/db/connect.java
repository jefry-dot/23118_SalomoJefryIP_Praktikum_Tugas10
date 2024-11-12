/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author mchai
 */
public class connect {
    
    private static Connection cnc;

    public static Connection cnc() throws SQLException, ClassNotFoundException {
        try {
            if (cnc == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugas10", "root", "");
                System.out.println("Koneksi berhasil!");
            }
            return cnc;
        } catch (SQLException e) {
            System.err.println("Error: Koneksi tidak berhasil! " + e.getMessage());
            throw e;
        }
    }
}