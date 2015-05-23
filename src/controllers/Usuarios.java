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
    
    public static Boolean checkUsuario(String usuario, String contra){
        String query = "select * from usuarios where usuario like '"+usuario+"' and contrasena like '"+contra+"'";
        List<Usuario> usuarios = (List<Usuario>) Usuarios.select(Conexion.getDBConexion(), query, Usuario.class);
        if(usuarios!=null){
            try{
            if(usuarios.get(0).getUsuario().equals(usuario) && usuarios.get(0).getContrasena().equals(contra)){
                if(usuarios.get(0).getUsuario().equals("administrador"))
                    return true;
                }else{
                return false;
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrecta.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrecta.");
            
        }
        return false;
    }
    
}
