package models;

import java.beans.PropertyChangeSupport;
import java.math.BigInteger;

/**
 *
 * @author Alejandro Escobedo
 */
public class Ingrediente extends BaseModel{
    public static final String PROP_ID = "PROP_ID";
    public static final String PROP_NOMBREINGREDIENTE = "PROP_NOMBREINGREDIENTE";
    public static final String PROP_EXISTENCIAINVENTARIO = "PROP_EXISTENCIAINVENTARIO";
    public static final String PROP_COSTOCOMPRA = "PROP_COSTOCOMPRA";
    public static final String PROP_PROVEEDOR = "PROP_PROVEEDOR";

    private BigInteger id;
    
    private String nombreIngrediente;
    
    private BigInteger existenciaInventario;
    
    private BigInteger costoCompra;
    
    private BigInteger proveedor;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the id
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(BigInteger id) {
        java.math.BigInteger oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    /**
     * @return the nombreIngrediente
     */
    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    /**
     * @param nombreIngrediente the nombreIngrediente to set
     */
    public void setNombreIngrediente(String nombreIngrediente) {
        java.lang.String oldNombreIngrediente = this.nombreIngrediente;
        this.nombreIngrediente = nombreIngrediente;
        propertyChangeSupport.firePropertyChange(PROP_NOMBREINGREDIENTE, oldNombreIngrediente, nombreIngrediente);
    }

    /**
     * @return the existenciaInventario
     */
    public BigInteger getExistenciaInventario() {
        return existenciaInventario;
    }

    /**
     * @param existenciaInventario the existenciaInventario to set
     */
    public void setExistenciaInventario(BigInteger existenciaInventario) {
        java.math.BigInteger oldExistenciaInventario = this.existenciaInventario;
        this.existenciaInventario = existenciaInventario;
        propertyChangeSupport.firePropertyChange(PROP_EXISTENCIAINVENTARIO, oldExistenciaInventario, existenciaInventario);
    }

    /**
     * @return the costoCompra
     */
    public BigInteger getCostoCompra() {
        return costoCompra;
    }

    /**
     * @param costoCompra the costoCompra to set
     */
    public void setCostoCompra(BigInteger costoCompra) {
        java.math.BigInteger oldCostoCompra = this.costoCompra;
        this.costoCompra = costoCompra;
        propertyChangeSupport.firePropertyChange(PROP_COSTOCOMPRA, oldCostoCompra, costoCompra);
    }

    /**
     * @return the proveedor
     */
    public BigInteger getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(BigInteger proveedor) {
        java.math.BigInteger oldProveedor = this.proveedor;
        this.proveedor = proveedor;
        propertyChangeSupport.firePropertyChange(PROP_PROVEEDOR, oldProveedor, proveedor);
    }
    
    
    
}
