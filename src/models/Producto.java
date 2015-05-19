package models;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Alejandro
 */
public class Producto extends BaseModel{
    public static final String PROP_ID_PRODUCTO = "PROP_ID_PRODUCTO";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_PRECIO_UNITARIO = "PROP_PRECIO_UNITARIO";

    
    private Integer id_producto;
    
    private String nombre;
    
    private Double precio_unitario;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Producto() {
    }

    public Producto(Integer id_producto, String nombre, Double precio_unitario) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
    }

    /**
     * @return the id_producto
     */
    public Integer getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(Integer id_producto) {
        java.lang.Integer oldId_producto = this.id_producto;
        this.id_producto = id_producto;
        propertyChangeSupport.firePropertyChange(PROP_ID_PRODUCTO, oldId_producto, id_producto);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        java.lang.String oldNombre = this.nombre;
        this.nombre = nombre;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE, oldNombre, nombre);
    }

    /**
     * @return the precio_unitario
     */
    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    /**
     * @param precio_unitario the precio_unitario to set
     */
    public void setPrecio_unitario(Double precio_unitario) {
        java.lang.Double oldPrecio_unitario = this.precio_unitario;
        this.precio_unitario = precio_unitario;
        propertyChangeSupport.firePropertyChange(PROP_PRECIO_UNITARIO, oldPrecio_unitario, precio_unitario);
    }
    
    
    
}
