package controllers;

import java.util.List;
import models.Usuario;
import oraclegeneral.Conexion;

/**
 * Clase controlador del modelo usuarios
 * @author Erik David Zubia Hernandez
 * @since 22/05/2015
 * @version 1.0
 */
public class Usuarios extends BaseController{
    
    public void checkUsuario(String usuario){
        String query = "select contrasena from usuarios where usuario like '"+usuario+"'";
        List<Usuario> usuarios = (List<Usuario>) Usuarios.select(Conexion.getDBConexion(), query, Usuario.class);
        if(usuarios.get(0).getContrasena().equals(usuario)){
            
        }
        
    }
    
}
