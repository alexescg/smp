package oraclegeneral;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

/**
 * Clase que contiene los metodos para la conexion de la base de datos asi como
 * los metodos de busqueda y de actualizacion de la base.
 * @author Erik David Zubia Hernandez
 * @version 1.0
 * @since 15/05/2015
 */
public class Conexion {
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static  String usuario ="panaderia";
    private static String contrasena = "abcd1234";
    private static Connection con;
    private static Statement st;
    private static String query = null;
    
   
    /**
     * Metodo que verifica la existencia del usuario que utilizara todo el sistema
     * @return falso cuando el usuario no existe y verdadero cuando si existe.
     */
    public static Boolean verificarUsuario(){
    try {   
            con= Conexion.getDBConexion();
            if(con!=null){
                con.close();
                return true;
            }
            return false;
        } catch (SQLException ex) {
            con=null;
            return false;
        }
        
    }
    
    /**
     * Metodo que conecta a la base de datos con la aplicacion.
     * @return conexion a la base de datos para poder interactuar con ella
     */
    public static Connection getDBConexion(){
        try {
            con= DriverManager.getConnection(url,usuario,contrasena);
        } catch (SQLException ex) {
            con = null;
        }
        return con;
    }
    
    /**
     * Metodo que crea el usuario que se utilizara para todo el sistem. 
     * Este solamente se usara una vez que sera al correr por primera vez el programa.
     */
    public static Boolean creacionUsuario(){
        JOptionPane.showMessageDialog(null, "Lo sentimos es la primera vez que entrara al sistema.\n"
                    + "Pongase en contacto con su DBA para que ingrese la contraseña del usuario \"System\" ...");
        System.out.println(".....");
        File file = new File("CrearUsuario.txt");
        usuario = "system";
        contrasena = JOptionPane.showInputDialog("Introduzca la contraseña del usuario system");
        try {
            FileReader in =  new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(in);
            System.out.println("-daosidjalsdjij");
            con=Conexion.getDBConexion();
            System.out.println(con);
            st = con.createStatement();
            while (br.readLine()!=null)   {
                query = br.readLine().toString();
                System.out.println (query);
                st.execute(query);
                query=null;
            }
            br.close();
            st.close();
            con.close();
        } catch (Exception e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
                return false;
        }
        return true;
        
    }
    
    /**
     * Metodo que Crea la base de datos para su utilizacion en el sistema. Este 
     * metodo solo se usara una vez al correr el programa por primera vez.
     */
    public static Boolean creacionBase(){
        FileReader fstream = null;
        usuario = "panaderia";
        contrasena = "abcd1234";
         File file = new File("CrearBase.txt");
        try {
            con=Conexion.getDBConexion();
            st = con.createStatement();
            fstream = new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(fstream);
            while (br.readLine()!= null)   {
                query = br.readLine().toString();
                System.out.println (query);
                st.executeUpdate(query);
            }
            br.close();
            st.close();
            con.close();
        } catch (Exception e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
                return false;
        }
        return true;
        
    }
    
}
