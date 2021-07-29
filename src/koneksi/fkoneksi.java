/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author danaw
 */
public class fkoneksi {
    static Connection koneksi ;
    public static Connection getConnection(){
        try{
         
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/logintubes","root","");
            System.out.println("Koneksi berhasil");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"ERROR : Koneksi Gagal");
        System.err.println("koneksi gagal "+e.getMessage());
        System.exit(0);
        }
        return koneksi;
        }
}

