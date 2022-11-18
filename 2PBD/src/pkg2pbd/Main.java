/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2pbd;

//import Controlador.CtrlProducto;
import Modelo.ConsultasVideo;
import Modelo.Video;
//import Vista.frmProducto;

/**
 *
 * @author GHI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // de esta clase principal vamos a llamar y enviar todo
        //MODELO
        Video mod = new Video();
        ConsultasVideo modC = new ConsultasVideo();
        modC.listar();
        //VISTA
        //frmProducto frm = new frmProducto();
        //CONTROLADOR
        //CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        //ctrl.iniciar();
        //frm.setVisible(true);
        
        
    }
    
}
