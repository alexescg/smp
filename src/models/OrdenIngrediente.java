package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Clase que contiene los atributos de OrdenIngrediente.
 * @author Alejandro Escobedo
 */
public class OrdenIngrediente extends BaseModel{
    public static final String PROP_ID = "PROP_ID";
    public static final String PROP_CANTIDAD = "PROP_CANTIDAD";
    public static final String PROP_FECHAPEDIDO = "PROP_FECHAPEDIDO";
    public static final String PROP_TOTALCOMPRA = "PROP_TOTALCOMPRA";
    public static final String PROP_PROVEEDOR = "PROP_PROVEEDOR";
    public static final String PROP_INGREDIENTE = "PROP_INGREDIENTE";
    
    private BigDecimal id;
    
    private BigDecimal Cantidad;
    
    private Timestamp fechaPedido;
    
    private BigDecimal totalCompra;

    private BigDecimal proveedor;
    
    private BigDecimal ingrediente;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(BigDecimal id) {
        java.math.BigDecimal oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    /**
     * @return the Cantidad
     */
    public BigDecimal getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(BigDecimal Cantidad) {
        java.math.BigDecimal oldCantidad = this.Cantidad;
        this.Cantidad = Cantidad;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD, oldCantidad, Cantidad);
    }

    /**
     * @return the fechaPedido
     */
    public Timestamp getFechaPedido() {
        return fechaPedido;
    }

    /**
     * @param fechaPedido the fechaPedido to set
     */
    public void setFechaPedido(Timestamp fechaPedido) {
        java.sql.Timestamp oldFechaPedido = this.fechaPedido;
        this.fechaPedido = fechaPedido;
        propertyChangeSupport.firePropertyChange(PROP_FECHAPEDIDO, oldFechaPedido, fechaPedido);
    }

    /**
     * @return the totalCompra
     */
    public BigDecimal getTotalCompra() {
        return totalCompra;
    }

    /**
     * @param totalCompra the totalCompra to set
     */
    public void setTotalCompra(BigDecimal totalCompra) {
        java.math.BigDecimal oldTotalCompra = this.totalCompra;
        this.totalCompra = totalCompra;
        propertyChangeSupport.firePropertyChange(PROP_TOTALCOMPRA, oldTotalCompra, totalCompra);
    }

    /**
     * @return the proveedor
     */
    public BigDecimal getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(BigDecimal proveedor) {
        java.math.BigDecimal oldProveedor = this.proveedor;
        this.proveedor = proveedor;
        propertyChangeSupport.firePropertyChange(PROP_PROVEEDOR, oldProveedor, proveedor);
    }

    /**
     * @return the ingrediente
     */
    public BigDecimal getIngrediente() {
        return ingrediente;
    }

    /**
     * @param ingrediente the ingrediente to set
     */
    public void setIngrediente(BigDecimal ingrediente) {
        java.math.BigDecimal oldIngrediente = this.ingrediente;
        this.ingrediente = ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_INGREDIENTE, oldIngrediente, ingrediente);
    }
}

