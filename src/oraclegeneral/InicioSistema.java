package oraclegeneral;
import controllers.Productos;
import java.util.List;
import java.util.stream.Collectors;
import models.Producto;
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
       
        
        List<Producto> productos = (List<Producto>) Productos.select(Conexion.getDBConexion(), "SELECT * FROM Producto", Producto.class);
        
        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));
        
        productos.stream().forEach((producto) -> {
            System.out.println("productoid = " + producto.getId_producto());
            System.out.println("productonombre = " + producto.getNombre());
            System.out.println("productonombre = " + producto.getPrecio_unitario());
        });


//        if(Conexion.verificarUsuario()==true){
//            System.out.println("NO entro");
//            Login frmLogin = new Login(); 
//           frmLogin.setVisible(true);
//        }else{
//            System.out.println("SI entro");
//            if((Conexion.creacionUsuario() ==true) && (Conexion.creacionBase()==true)){
//            Login frmLogin = new Login();
//            frmLogin.setVisible(true);
//            }
//        }
    }
    
    
    
    
}
