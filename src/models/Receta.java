package models;

import java.awt.Image;
import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 *
 * @author Alejandro Escobedo
 */
public class Receta extends BaseModel{
    public static final String PROP_ID_RECETA = "PROP_ID_RECETA";
    public static final String PROP_ID_PRODUCTO = "PROP_ID_PRODUCTO";
    public static final String PROP_TIEMPO_COCCION = "PROP_TIEMPO_COCCION";
    public static final String PROP_CANTIDAD_HECHA = "PROP_CANTIDAD_HECHA";
    public static final String PROP_DESCRIPCION = "PROP_DESCRIPCION";
    public static final String PROP_IMAGEN = "PROP_IMAGEN";

    private BigDecimal id_receta;
    
    private BigDecimal id_producto;
    
    private BigDecimal tiempo_coccion;
    
    private BigDecimal cantidad_hecha;
    
    private String descripcion;
    
    private Image imagen;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the id_receta
     */
    public BigDecimal getId_receta() {
        return id_receta;
    }

    /**
     * @param id_receta the id_receta to set
     */
    public void setId_receta(BigDecimal id_receta) {
        java.math.BigDecimal oldId_receta = this.id_receta;
        this.id_receta = id_receta;
        propertyChangeSupport.firePropertyChange(PROP_ID_RECETA, oldId_receta, id_receta);
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
        propertyChangeSupport.firePropertyChange(PROP_ID_PRODUCTO, oldId_producto, id_producto);
    }

    /**
     * @return the tiempo_coccion
     */
    public BigDecimal getTiempo_coccion() {
        return tiempo_coccion;
    }

    /**
     * @param tiempo_coccion the tiempo_coccion to set
     */
    public void setTiempo_coccion(BigDecimal tiempo_coccion) {
        java.math.BigDecimal oldTiempo_coccion = this.tiempo_coccion;
        this.tiempo_coccion = tiempo_coccion;
        propertyChangeSupport.firePropertyChange(PROP_TIEMPO_COCCION, oldTiempo_coccion, tiempo_coccion);
    }

    /**
     * @return the cantidad_hecha
     */
    public BigDecimal getCantidad_hecha() {
        return cantidad_hecha;
    }

    /**
     * @param cantidad_hecha the cantidad_hecha to set
     */
    public void setCantidad_hecha(BigDecimal cantidad_hecha) {
        java.math.BigDecimal oldCantidad_hecha = this.cantidad_hecha;
        this.cantidad_hecha = cantidad_hecha;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD_HECHA, oldCantidad_hecha, cantidad_hecha);
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        java.lang.String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        propertyChangeSupport.firePropertyChange(PROP_DESCRIPCION, oldDescripcion, descripcion);
    }

    /**
     * @return the imagen
     */
    public Image getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(Image imagen) {
        java.awt.Image oldImagen = this.imagen;
        this.imagen = imagen;
        propertyChangeSupport.firePropertyChange(PROP_IMAGEN, oldImagen, imagen);
    }
   
}
