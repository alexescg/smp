package models;

import java.beans.PropertyChangeSupport;
import java.util.Date;

/**
 *
 * @author Alejandro Escobedo
 */
public class OrdenIngrediente extends BaseModel{
    public static final String PROP_ID = "PROP_ID";
    public static final String PROP_CANTIDAD = "PROP_CANTIDAD";
    public static final String PROP_FECHAPEDIDO = "PROP_FECHAPEDIDO";
    public static final String PROP_TOTALCOMPRA = "PROP_TOTALCOMPRA";
    public static final String PROP_PROVEEDOR = "PROP_PROVEEDOR";
    public static final String PROP_INGREDIENTE = "PROP_INGREDIENTE";
    
    private Integer id;
    
    private Double Cantidad;
    
    private Date fechaPedido;
    
    private Double totalCompra;

    private Proveedor proveedor;
    
    private Ingrediente ingrediente;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public OrdenIngrediente() {
    }

    public OrdenIngrediente(Integer id, Double Cantidad, Date fechaPedido, Double totalCompra, Proveedor proveedor, Ingrediente ingrediente) {
        this.id = id;
        this.Cantidad = Cantidad;
        this.fechaPedido = fechaPedido;
        this.totalCompra = totalCompra;
        this.proveedor = proveedor;
        this.ingrediente = ingrediente;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        java.lang.Integer oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    /**
     * @return the Cantidad
     */
    public Double getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(Double Cantidad) {
        java.lang.Double oldCantidad = this.Cantidad;
        this.Cantidad = Cantidad;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD, oldCantidad, Cantidad);
    }

    /**
     * @return the fechaPedido
     */
    public Date getFechaPedido() {
        return fechaPedido;
    }

    /**
     * @param fechaPedido the fechaPedido to set
     */
    public void setFechaPedido(Date fechaPedido) {
        java.util.Date oldFechaPedido = this.fechaPedido;
        this.fechaPedido = fechaPedido;
        propertyChangeSupport.firePropertyChange(PROP_FECHAPEDIDO, oldFechaPedido, fechaPedido);
    }

    /**
     * @return the totalCompra
     */
    public Double getTotalCompra() {
        return totalCompra;
    }

    /**
     * @param totalCompra the totalCompra to set
     */
    public void setTotalCompra(Double totalCompra) {
        java.lang.Double oldTotalCompra = this.totalCompra;
        this.totalCompra = totalCompra;
        propertyChangeSupport.firePropertyChange(PROP_TOTALCOMPRA, oldTotalCompra, totalCompra);
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        models.Proveedor oldProveedor = this.proveedor;
        this.proveedor = proveedor;
        propertyChangeSupport.firePropertyChange(PROP_PROVEEDOR, oldProveedor, proveedor);
    }

    /**
     * @return the ingrediente
     */
    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    /**
     * @param ingrediente the ingrediente to set
     */
    public void setIngrediente(Ingrediente ingrediente) {
        models.Ingrediente oldIngrediente = this.ingrediente;
        this.ingrediente = ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_INGREDIENTE, oldIngrediente, ingrediente);
    }
    
    
}

