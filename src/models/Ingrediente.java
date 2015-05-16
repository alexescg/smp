package models;

import java.beans.PropertyChangeSupport;

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
    
    private Integer id;
    
    private String nombreIngrediente;
    
    private Integer existenciaInventario;
    
    private Double costoCompra;
    
    private Proveedor proveedor;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Ingrediente() {
    }

    public Ingrediente(Integer id, String nombreIngrediente, Integer existenciaInventario, Double costoCompra, Proveedor proveedor) {
        this.id = id;
        this.nombreIngrediente = nombreIngrediente;
        this.existenciaInventario = existenciaInventario;
        this.costoCompra = costoCompra;
        this.proveedor = proveedor;
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
    public Integer getExistenciaInventario() {
        return existenciaInventario;
    }

    /**
     * @param existenciaInventario the existenciaInventario to set
     */
    public void setExistenciaInventario(Integer existenciaInventario) {
        java.lang.Integer oldExistenciaInventario = this.existenciaInventario;
        this.existenciaInventario = existenciaInventario;
        propertyChangeSupport.firePropertyChange(PROP_EXISTENCIAINVENTARIO, oldExistenciaInventario, existenciaInventario);
    }

    /**
     * @return the costoCompra
     */
    public Double getCostoCompra() {
        return costoCompra;
    }

    /**
     * @param costoCompra the costoCompra to set
     */
    public void setCostoCompra(Double costoCompra) {
        java.lang.Double oldCostoCompra = this.costoCompra;
        this.costoCompra = costoCompra;
        propertyChangeSupport.firePropertyChange(PROP_COSTOCOMPRA, oldCostoCompra, costoCompra);
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
    
    
    
}
