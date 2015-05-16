package models;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Alejandro Escobedo
 */
public class Proveedor extends BaseModel{
    public static final String PROP_IDPROVEEDOR = "PROP_IDPROVEEDOR";
    public static final String PROP_NOMBREPROVEEDOR = "PROP_NOMBREPROVEEDOR";
    public static final String PROP_DIRECCIONPROVEEDOR = "PROP_DIRECCIONPROVEEDOR";
    public static final String PROP_TELEFONO = "PROP_TELEFONO";
    public static final String PROP_CIUDAD = "PROP_CIUDAD";
    
    private Integer idProveedor;
    
    private String nombreProveedor;
    
    private String direccionProveedor;
    
    private Integer telefono;
    
    private String ciudad;
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor, String nombreProveedor, String direccionProveedor, Integer telefono, String ciudad) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }
    
    /**
     * Constructor para proveedor sin id.
     * @param nombreProveedor
     * @param direccionProveedor
     * @param telefono
     * @param ciudad 
     */
    public Proveedor(String nombreProveedor, String direccionProveedor, Integer telefono, String ciudad) {
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    /**
     * @return the idProveedor
     */
    public Integer getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(Integer idProveedor) {
        java.lang.Integer oldIdProveedor = this.idProveedor;
        this.idProveedor = idProveedor;
        propertyChangeSupport.firePropertyChange(PROP_IDPROVEEDOR, oldIdProveedor, idProveedor);
    }

    /**
     * @return the nombreProveedor
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    /**
     * @param nombreProveedor the nombreProveedor to set
     */
    public void setNombreProveedor(String nombreProveedor) {
        java.lang.String oldNombreProveedor = this.nombreProveedor;
        this.nombreProveedor = nombreProveedor;
        propertyChangeSupport.firePropertyChange(PROP_NOMBREPROVEEDOR, oldNombreProveedor, nombreProveedor);
    }

    /**
     * @return the direccionProveedor
     */
    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    /**
     * @param direccionProveedor the direccionProveedor to set
     */
    public void setDireccionProveedor(String direccionProveedor) {
        java.lang.String oldDireccionProveedor = this.direccionProveedor;
        this.direccionProveedor = direccionProveedor;
        propertyChangeSupport.firePropertyChange(PROP_DIRECCIONPROVEEDOR, oldDireccionProveedor, direccionProveedor);
    }

    /**
     * @return the telefono
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Integer telefono) {
        java.lang.Integer oldTelefono = this.telefono;
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
