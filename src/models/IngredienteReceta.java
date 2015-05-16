package models;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Alejandro Escobedo
 */
public class IngredienteReceta extends BaseModel{
    public static final String PROP_INGREDIENTE = "PROP_INGREDIENTE";
    public static final String PROP_PROVEEDOR = "PROP_PROVEEDOR";
    public static final String PROP_CANTIDADINGREDIENTE = "PROP_CANTIDADINGREDIENTE";
    
    private Ingrediente ingrediente;
    
    private Proveedor proveedor;
    
    private Double cantidadIngrediente;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public IngredienteReceta() {
    }

    public IngredienteReceta(Ingrediente ingrediente, Proveedor proveedor, Double cantidadIngrediente) {
        this.ingrediente = ingrediente;
        this.proveedor = proveedor;
        this.cantidadIngrediente = cantidadIngrediente;
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
     * @return the cantidadIngrediente
     */
    public Double getCantidadIngrediente() {
        return cantidadIngrediente;
    }

    /**
     * @param cantidadIngrediente the cantidadIngrediente to set
     */
    public void setCantidadIngrediente(Double cantidadIngrediente) {
        java.lang.Double oldCantidadIngrediente = this.cantidadIngrediente;
        this.cantidadIngrediente = cantidadIngrediente;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDADINGREDIENTE, oldCantidadIngrediente, cantidadIngrediente);
    }
    
    
    
}
