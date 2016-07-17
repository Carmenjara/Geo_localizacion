/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodo;

import Datos.Aulas;
import java.sql.*;
import java.util.ArrayList;

/**
 * @author Gabriela y Rocío
 */
public class ManejadorBD {
    private Statement stat;
    private ConexionBD bd;
    private Connection con;
    //private String seleccionar;

    public ManejadorBD() {
        enlazarBD();
    }
    public void enlazarBD(){
        bd = new ConexionBD();
        con = bd.Conectar();//buffer de conexion
        try {
            stat = con.createStatement();//manejar la base de datos
        }
        catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public ArrayList<Aulas> importarDatos() throws ClassNotFoundException, SQLException{
        ArrayList<Aulas> listAulas = new ArrayList<>();
        ResultSet rs = consultarDatos();
        
        while(rs.next()){
            Aulas aula = new Aulas();
            aula.setId(rs.getInt(1));
            aula.setEdificio(rs.getString(2));
            aula.setPiso(rs.getString(3));
            aula.setCoordenadaX(rs.getDouble(4));
            aula.setCoordenadaY(rs.getDouble(5));
            aula.setContenido(rs.getString(6));
            listAulas.add(aula);
        }
        return listAulas;
    }
    
    public ResultSet consultarDatos() throws ClassNotFoundException, SQLException{
        String sentencia = "SELECT * FROM tabla_coordenadas";
        ResultSet rs = stat.executeQuery(sentencia);
        return rs;
    }
}
