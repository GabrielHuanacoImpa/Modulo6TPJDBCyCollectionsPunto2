/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GHI
 */
public class ConsultasVideo extends Conexion {
    private Video vid;
    public ConsultasVideo() {
    }
/*
    public ConsultasVideo(Video vid) {
        this.vid = vid;
    }
*/
    //public void listar (Video vid) {
    public void listar () {
        // para preparar la consulta e enviar los datos
        PreparedStatement ps = null;
        
        //uso una nueva variable para ver resultado
        ResultSet rs = null;
        
        Connection con = getConexion();

        String sql = "SELECT * FROM videos";
        //ahora le envio los datos con try catch
        try {
            //enviamos la variable sql
            ps = con.prepareStatement(sql);
            //enviamos todos los datos

            //ps.setString(1, vid.getCodigo());
            //ejecutamos instruccion sql de consulta
            rs = ps.executeQuery();
            //rs trae todos los resultados de la consulta
            // uso rs.next para traer una fila, para traer mas debo usar while
            List <Video> listaVideo = new ArrayList<Video>();
            //int i=1;
            while(rs.next()){

                this.vid.setId(Integer.parseInt(rs.getString("id")));
                this.vid.setNombre(rs.getString("nombre"));
                this.vid.setDescripcion(rs.getString("descripcion"));
                this.vid.setTipo(rs.getString("tipo"));
                this.vid.setFormato(rs.getString("formato"));
                this.vid.setDuracion(Double.parseDouble(rs.getString("duracion")));
                this.vid.setTamaño(Double.parseDouble(rs.getString("tamaño")));
                
                this.vid.setCantLike(Integer.parseInt(rs.getString("cantlike")));
                this.vid.setCantDislike(Integer.parseInt(rs.getString("cantDislike")));

                //listaVideo.add((Video) rs.getObject(i));
                //i++;
                listaVideo.add(this.vid);
 
            }//fin while
            for(Video n: listaVideo){
                System.out.println(n.toString());
            }
            
            //return true;
   
            //return false;
        } catch (SQLException e) {
            System.err.println(e);
            //return false;
            //finalmente, no importa si se ejecuto correctamente para finalizar la conexion
        } finally {
            try {
                // cerramos la conexion
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    } //fin buscar
    
} // fin ConsultasVideo

