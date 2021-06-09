/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author MSI GF75
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        
        //cek apakah koneksi null
        if(koneksi==null){
            try{
                String url = "jdbc:mysql://localhost/pertanian";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                
            }catch(SQLException t){
                System.out.println("Error membuat koneksi");
            }
        }
        return koneksi;
    }
}
