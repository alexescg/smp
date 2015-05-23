package controllers;

import java.util.List;
import javax.swing.JOptionPane;
import models.Usuario;
import oraclegeneral.Conexion;
import views.BaseFrame;

/**
 * Clase controlador del modelo usuarios
 * @author Erik David Zubia Hernandez
 * @since 22/05/2015
 * @version 1.0
 */
public class Usuarios extends BaseController{
    
    public static void checkUsuario(String usuario, String contra){
        String query = "select contrasena from usuarios where usuario = '"+usuario+"' and contrasena = '"+contra+"';";
        List<Usuario> usuarios = (List<Usuario>) Usuarios.select(Conexion.getDBConexion(), query, Usuario.class);
        if(usuarios!=null){
            if(usuarios.get(0).getUsuario().equals(usuario) && usuarios.get(0).getContrasena().equals(contra)){
                BaseFrame bs = new BaseFrame();
                bs.setVisible(true);
            } 
        }else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrecta.");
           
        }
    }
    
}
