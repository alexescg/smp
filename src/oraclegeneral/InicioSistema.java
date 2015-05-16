package oraclegeneral;
import views.Login;
/**
 *Clase que iniciara el sistema y verificara la existencia del usuario de la base de datos que se 
 * utilizara a lo largo de la ejecucion.
 * @author Erik David Zubia Hernandez.
 * @since 16/05/2015
 * @version 1.0
 */
public class InicioSistema {
    
    public static void main(String[] args) {
        if(Conexion.verificarUsuario()==true){
           Login frmLogin = new Login(); 
           frmLogin.setVisible(true);
        }else{
            Conexion.creacionUsuario();
            Conexion.creacionBase();
            Login frmLogin = new Login();
            frmLogin.setVisible(true);
        }
    }
}
