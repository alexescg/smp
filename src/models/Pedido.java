package models;

import java.beans.PropertyChangeSupport;
import java.util.Date;

/**
 *
 * @author Alejandro Escobedo
 */
public class Pedido extends BaseModel{
    public static final String PROP_ID = "PROP_ID";
    public static final String PROP_CANTIDADPRODUCTO = "PROP_CANTIDADPRODUCTO";
    public static final String PROP_FECHAPEDIDO = "PROP_FECHAPEDIDO";
    public static final String PROP_TOTAL = "PROP_TOTAL";
    public static final String PROP_FECHAENTREGA = "PROP_FECHAENTREGA";
    public static final String PROP_PRODUCTO = "PROP_PRODUCTO";
    
    private Integer id;
    
    private Integer cantidadProducto;
    
    private Date fechaPedido;
    
    private Double total;
    
    private Date fechaEntrega;
    
    private Producto producto;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Pedido() {
    }

    public Pedido(Integer id, Integer cantidadProducto, Date fechaPedido, Double total, Date fechaEntrega, Producto producto) {
        this.id = id;
        this.cantidadProducto = cantidadProducto;
        this.fechaPedido = fechaPedido;
        this.total = total;
        this.fechaEntrega = fechaEntrega;
        this.producto = producto;
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
     * @return the cantidadProducto
     */
    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * @param cantidadProducto the cantidadProducto to set
     */
    public void setCantidadProducto(Integer cantidadProducto) {
        java.lang.Integer oldCantidadProducto = this.cantidadProducto;
        this.cantidadProducto = cantidadProducto;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDADPRODUCTO, oldCantidadProducto, cantidadProducto);
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
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        java.lang.Double oldTotal = this.total;
        this.total = total;
        propertyChangeSupport.firePropertyChange(PROP_TOTAL, oldTotal, total);
    }

    /**
     * @return the fechaEntrega
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(Date fechaEntrega) {
        java.util.Date oldFechaEntrega = this.fechaEntrega;
        this.fechaEntrega = fechaEntrega;
        propertyChangeSupport.firePropertyChange(PROP_FECHAENTREGA, oldFechaEntrega, fechaEntrega);
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        models.Producto oldProducto = this.producto;
        this.producto = producto;
        propertyChangeSupport.firePropertyChange(PROP_PRODUCTO, oldProducto, producto);
    }
    
    
    
}
