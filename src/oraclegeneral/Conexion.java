package oraclegeneral;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *Clase que contiene los metodos para la conexion de la base de datos asi como
 * los metodos de busqueda y de actualizacion de la base.
 * @author Erik David Zubia Hernandez
 * @version 1.0
 * @since 15/05/2015
 */
public class Conexion {
    private static final String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static  String usuario ="panaderia";
    private static String contrasena = "abcd1234";
    private static Connection con;
    private static Statement st;
    private static String query = "";
   
    /**
     * Metodo que verifica la existencia del usuario que utilizara todo el sistema
     * @return falso cuando el usuario no existe y verdadero cuando si existe.
     */
    public static Boolean verificarUsuario(){
    try {  
            con=DriverManager.getConnection(url,usuario,contrasena);
            con.close();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Metodo que conecta a la base de datos con la aplicacion.
     * @return conexion a la base de datos para poder interactuar con ella
     */
    public static Connection getDBConexion() {
        try {  
            con=DriverManager.getConnection(url,usuario,contrasena);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return con;
    }
    
    /**
     * Metodo que crea el usuario que se utilizara para todo el sistem. 
     * Este solamente se usara una vez que sera al correr por primera vez el programa.
     */
    public static void creacionUsuario(){
        JOptionPane.showMessageDialog(null, "Lo sentimos es la primera vez que entrara al sistema.\n"
                    + "Pongase en contacto con su DBA para que ingrese el usuario \"System\" y la contraseña"
                    + "correspondiente...");
        FileInputStream fstream = null;
        usuario = "SYSTEM";
        contrasena = JOptionPane.showInputDialog("Introdusca la contraseña del usuario system");
        try {
            con=DriverManager.getConnection(url,usuario,contrasena);
            st = con.createStatement();
            fstream = new FileInputStream("CrearUsuario.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            while ((query = br.readLine()) != null)   {
                st.execute(query);
                System.out.println (query);
            }
            br.close();
            st.close();
            con.close();
        } catch (Exception e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    /**
     * Metodo que Crea la base de datos para su utilizacion en el sistema. Este 
     * metodo solo se usara una vez al correr el programa por primera vez.
     */
    public static void creacionBase(){
        FileInputStream fstream = null;
        usuario = "panaderia";
        contrasena = "abcd1234";
        try {
            con=DriverManager.getConnection(url,usuario,contrasena);
            st = con.createStatement();
            fstream = new FileInputStream("CrearUsuario.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            while ((query = br.readLine()) != null)   {
                st.execute(query);
                System.out.println (query);
            }
            br.close();
            st.close();
            con.close();
        } catch (Exception e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
}
