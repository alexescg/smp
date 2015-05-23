package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 *
 * @author Alejandro Escobedo
 */
public class Proveedor extends BaseModel{
    public static final String PROP_ID_PROVEEDOR = "PROP_ID_PROVEEDOR";
    public static final String PROP_NOMBRE_PROVEEDOR = "PROP_NOMBRE_PROVEEDOR";
    public static final String PROP_DIRECCION_PROVEEDOR = "PROP_DIRECCION_PROVEEDOR";
    public static final String PROP_TELEFONO = "PROP_TELEFONO";
    public static final String PROP_CIUDAD = "PROP_CIUDAD";
    
    
    private BigDecimal id_proveedor;
    
    private String nombre_proveedor;
    
    private String direccion_proveedor;
    
    private BigDecimal telefono;
    
    private String ciudad;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the id_proveedor
     */
    public BigDecimal getId_proveedor() {
        return id_proveedor;
    }

    /**
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(BigDecimal id_proveedor) {
        java.math.BigDecimal oldId_proveedor = this.id_proveedor;
        this.id_proveedor = id_proveedor;
        propertyChangeSupport.firePropertyChange(PROP_ID_PROVEEDOR, oldId_proveedor, id_proveedor);
    }

    /**
     * @return the nombre_proveedor
     */
    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    /**
     * @param nombre_proveedor the nombre_proveedor to set
     */
    public void setNombre_proveedor(String nombre_proveedor) {
        java.lang.String oldNombre_proveedor = this.nombre_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE_PROVEEDOR, oldNombre_proveedor, nombre_proveedor);
    }

    /**
     * @return the direccion_proveedor
     */
    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    /**
     * @param direccion_proveedor the direccion_proveedor to set
     */
    public void setDireccion_proveedor(String direccion_proveedor) {
        java.lang.String oldDireccion_proveedor = this.direccion_proveedor;
        this.direccion_proveedor = direccion_proveedor;
        propertyChangeSupport.firePropertyChange(PROP_DIRECCION_PROVEEDOR, oldDireccion_proveedor, direccion_proveedor);
    }

    /**
     * @return the telefono
     */
    public BigDecimal getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(BigDecimal telefono) {
        java.math.BigDecimal oldTelefono = this.telefono;
        this.telefono = telefono;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONO, oldTelefono, telefono);
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        java.lang.String oldCiudad = this.ciudad;
        this.ciudad = ciudad;
        propertyChangeSupport.firePropertyChange(PROP_CIUDAD, oldCiudad, ciudad);
    }
    
    
    
}
