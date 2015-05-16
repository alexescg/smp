package models;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Alejandro
 */
public class Producto extends BaseModel{
    public static final String PROP_ID = "PROP_ID";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_PRECIOUNITARIO = "PROP_PRECIOUNITARIO";
    
    private Integer id;
    
    private String nombre;
    
    private Double precioUnitario;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Producto() {
    }

    public Producto(Integer id, String nombre, Double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
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
     * @return the precioUnitario
     */
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(Double precioUnitario) {
        java.lang.Double oldPrecioUnitario = this.precioUnitario;
        this.precioUnitario = precioUnitario;
        propertyChangeSupport.firePropertyChange(PROP_PRECIOUNITARIO, oldPrecioUnitario, precioUnitario);
    }
    
    
}
