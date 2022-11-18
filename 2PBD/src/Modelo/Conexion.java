/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author GHI
 */
public class Conexion {
      //creamos la conexion con constantes
    private final String BASE = "bdyoutube";
    private final String USER = "root";
    private final String PASSWORD = "impa3155";
    private final String URL = "jdbc:mysql://localhost:3306/" + BASE;
    //esta variable optiene la conexion y despues la retorna
    private Connection  con = null;
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        } catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        // de esta manera tenemos la conexion a la base de datos
    }
}
