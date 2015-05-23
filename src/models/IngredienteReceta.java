package models;

import java.beans.PropertyChangeSupport;
import java.math.BigInteger;

/**
 * Clase que contiene los atributos de Ingrediente-Receta.
 * @author Alejandro Escobedo
 */
public class IngredienteReceta extends BaseModel{
    public static final String PROP_INGREDIENTE = "PROP_INGREDIENTE";
    public static final String PROP_PROVEEDOR = "PROP_PROVEEDOR";
    public static final String PROP_CANTIDADINGREDIENTE = "PROP_CANTIDADINGREDIENTE";
    
    //Id ingrediente
    private BigInteger ingrediente;
    
    //Id proveedor
    private BigInteger proveedor;
    
    private BigInteger cantidadIngrediente;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the ingrediente
     */
    public BigInteger getIngrediente() {
        return ingrediente;
    }

    /**
     * @param ingrediente the ingrediente to set
     */
    public void setIngrediente(BigInteger ingrediente) {
        java.math.BigInteger oldIngrediente = this.ingrediente;
        this.ingrediente = ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_INGREDIENTE, oldIngrediente, ingrediente);
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

    /**
     * @return the cantidadIngrediente
     */
    public BigInteger getCantidadIngrediente() {
        return cantidadIngrediente;
    }

    /**
     * @param cantidadIngrediente the cantidadIngrediente to set
     */
    public void setCantidadIngrediente(BigInteger cantidadIngrediente) {
        java.math.BigInteger oldCantidadIngrediente = this.cantidadIngrediente;
        this.cantidadIngrediente = cantidadIngrediente;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDADINGREDIENTE, oldCantidadIngrediente, cantidadIngrediente);
    }
    
}
