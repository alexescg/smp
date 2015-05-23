package models;

import java.beans.PropertyChangeSupport;
import java.math.BigInteger;

/**
 * Clase que contiene los atributos de un Ingrediente.
 * @author Alejandro Escobedo
 */
public class Ingrediente extends BaseModel{
    public static final String PROP_ID_INGREDIENTE = "PROP_ID_INGREDIENTE";
    public static final String PROP_NOMBRE_INGREDIENTE = "PROP_NOMBRE_INGREDIENTE";
    public static final String PROP_EXISTENCIA_INVENTARIO = "PROP_EXISTENCIA_INVENTARIO";
    public static final String PROP_COSTO_COMPRA = "PROP_COSTO_COMPRA";
    public static final String PROP_ID_PROVEEDOR = "PROP_ID_PROVEEDOR";

    private BigInteger id_ingrediente;
    
    private String nombre_ingrediente;
    
    private BigInteger existencia_inventario;
    
    private BigInteger costo_compra;
    
    private BigInteger id_proveedor;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Metodo para obtener un id_ingrediente de un objeto Ingrediente.
     * @return the id_ingrediente
     */
    public BigInteger getId_ingrediente() {
        return id_ingrediente;
    }

    /**
     * Metodo para asignar un id_ingrediente a un objeto Ingrediente.
     * @param id_ingrediente the id_ingrediente to set
     */
    public void setId_ingrediente(BigInteger id_ingrediente) {
        java.math.BigInteger oldId_ingrediente = this.id_ingrediente;
        this.id_ingrediente = id_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_ID_INGREDIENTE, oldId_ingrediente, id_ingrediente);
    }

    /**
     * Metodo para obtener un nombre_ingrediente de un objeto Ingrediente.
     * @return the nombre_ingrediente
     */
    public String getNombre_ingrediente() {
        return nombre_ingrediente;
    }

    /**
     * Metodo para asignar un nombre_ingrediente a un objeto Ingrediente.
     * @param nombre_ingrediente the nombre_ingrediente to set
     */
    public void setNombre_ingrediente(String nombre_ingrediente) {
        java.lang.String oldNombre_ingrediente = this.nombre_ingrediente;
        this.nombre_ingrediente = nombre_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE_INGREDIENTE, oldNombre_ingrediente, nombre_ingrediente);
    }

    /**
     * Metodo para obtener existencia_inventario de un objeto Ingrediente.
     * @return the existencia_inventario
     */
    public BigInteger getExistencia_inventario() {
        return existencia_inventario;
    }

    /**
     * Metodo para asignar un nombre_ingrediente a un objeto Ingrediente.
     * @param existencia_inventario the existencia_inventario to set
     */
    public void setExistencia_inventario(BigInteger existencia_inventario) {
        java.math.BigInteger oldExistencia_inventario = this.existencia_inventario;
        this.existencia_inventario = existencia_inventario;
        propertyChangeSupport.firePropertyChange(PROP_EXISTENCIA_INVENTARIO, oldExistencia_inventario, existencia_inventario);
    }

    /**
     * Metodo para obtener costo compra de un objeto Ingrediente.
     * @return the costo_compra
     */
    public BigInteger getCosto_compra() {
        return costo_compra;
    }

    /**
     * Metodo para asignar un nombre_ingrediente a un objeto Ingrediente.
     * @param costo_compra the costo_compra to set
     */
    public void setCosto_compra(BigInteger costo_compra) {
        java.math.BigInteger oldCosto_compra = this.costo_compra;
        this.costo_compra = costo_compra;
        propertyChangeSupport.firePropertyChange(PROP_COSTO_COMPRA, oldCosto_compra, costo_compra);
    }

    /**
     * Metodo para obtener un id_proveedor de un objeto Ingrediente.
     * @return the id_proveedor
     */
    public BigInteger getId_proveedor() {
        return id_proveedor;
    }

    /**
     * Metodo para asignar un nombre_ingrediente a un objeto Ingrediente.
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(BigInteger id_proveedor) {
        java.math.BigInteger oldId_proveedor = this.id_proveedor;
        this.id_proveedor = id_proveedor;
        propertyChangeSupport.firePropertyChange(PROP_ID_PROVEEDOR, oldId_proveedor, id_proveedor);
    }
    
}
