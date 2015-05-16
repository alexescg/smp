package models;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Alejandro Escobedo
 */
public class Receta extends BaseModel{
    public static final String PROP_ID = "PROP_ID";
    public static final String PROP_TIPOCOCION = "PROP_TIPOCOCION";
    public static final String PROP_CANTIDADPRODUCIDA = "PROP_CANTIDADPRODUCIDA";
    
    private Integer id;
    
    private Double tipoCocion;
    
    private Double cantidadProducida;
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Receta() {
    }

    public Receta(Integer id, Double tipoCocion, Double cantidadProducida) {
        this.id = id;
        this.tipoCocion = tipoCocion;
        this.cantidadProducida = cantidadProducida;
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
     * @return the tipoCocion
     */
    public Double getTipoCocion() {
        return tipoCocion;
    }

    /**
     * @param tipoCocion the tipoCocion to set
     */
    public void setTipoCocion(Double tipoCocion) {
        java.lang.Double oldTipoCocion = this.tipoCocion;
        this.tipoCocion = tipoCocion;
        propertyChangeSupport.firePropertyChange(PROP_TIPOCOCION, oldTipoCocion, tipoCocion);
    }

    /**
     * @return the cantidadProducida
     */
    public Double getCantidadProducida() {
        return cantidadProducida;
    }

    /**
     * @param cantidadProducida the cantidadProducida to set
     */
    public void setCantidadProducida(Double cantidadProducida) {
        java.lang.Double oldCantidadProducida = this.cantidadProducida;
        this.cantidadProducida = cantidadProducida;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDADPRODUCIDA, oldCantidadProducida, cantidadProducida);
    }
    
    
    
    
}
