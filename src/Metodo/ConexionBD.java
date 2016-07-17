/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Gabriela y Rocío
 */
public class ConexionBD {
    private String db = "google_maps";//Encapsulacion
    private String url = "jdbc:mysql://localhost/"+db;
    private String user = "bdroot";
    private String pass = "bdroot";

    public Connection Conectar(){
        Connection link = null;//detwrminar conexion de bd
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            link = DriverManager.getConnection(this.url, this.user, this.pass);

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, ex);
        }
        return link;
    }
}
