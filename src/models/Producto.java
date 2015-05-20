package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 *
 * @author Alejandro
 */
public class Producto extends BaseModel{
    public static final String PROP_ID_PRODUCTO = "PROP_ID_PRODUCTO";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_PRECIO_UNITARIO = "PROP_PRECIO_UNITARIO";

    
    public static final String PROP_ID_PRODUCTO_1 = "PROP_ID_PRODUCTO_1";
    public BigDecimal id_producto;
    
    public String nombre;
    
    public BigDecimal precio_unitario;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Producto() {
    }

    public Producto(BigDecimal id_producto, String nombre, BigDecimal precio_unitario) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
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
     * @return the id_producto
     */
    public BigDecimal getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(BigDecimal id_producto) {
        java.math.BigDecimal oldId_producto = this.id_producto;
        this.id_producto = id_producto;
        propertyChangeSupport.firePropertyChange(PROP_ID_PRODUCTO_1, oldId_producto, id_producto);
    }
    
    
    
}
