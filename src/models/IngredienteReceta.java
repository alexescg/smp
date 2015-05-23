package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 * Clase que contiene los atributos de Ingrediente-Receta.
 * @author Alejandro Escobedo
 */
public class IngredienteReceta extends BaseModel{
    public static final String PROP_ID_INGREDIENTE = "PROP_ID_INGREDIENTE";
    public static final String PROP_ID_PROVEEDOR = "PROP_ID_PROVEEDOR";
    public static final String PROP_CANTIDAD_INGREDIENTE = "PROP_CANTIDAD_INGREDIENTE";
    
    private BigDecimal id_ingrediente;
    
    private BigDecimal id_proveedor;
    
    private BigDecimal cantidad_ingrediente;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Método para obtener un id_ingrediente de un objeto IngredienteReceta.
     * @return the id_ingrediente
     */
    public BigDecimal getId_ingrediente() {
        return id_ingrediente;
    }

    /**
     * Método para asignar un id_ingrediente a un objeto IngredienteReceta.
     * @param id_ingrediente the id_ingrediente to set
     */
    public void setId_ingrediente(BigDecimal id_ingrediente) {
        java.math.BigDecimal oldId_ingrediente = this.id_ingrediente;
        this.id_ingrediente = id_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_ID_INGREDIENTE, oldId_ingrediente, id_ingrediente);
    }

    /**
     * Método para obtener un id_proveedor de un objeto IngredienteReceta.
     * @return the id_proveedor
     */
    public BigDecimal getId_proveedor() {
        return id_proveedor;
    }

    /**
     * Método para asignar un id_proveedor a un objeto IngredienteReceta.
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(BigDecimal id_proveedor) {
        java.math.BigDecimal oldId_proveedor = this.id_proveedor;
        this.id_proveedor = id_proveedor;
        propertyChangeSupport.firePropertyChange(PROP_ID_PROVEEDOR, oldId_proveedor, id_proveedor);
    }

    /**
     * Método para obtener un cantidad_ingrediente de un objeto IngredienteReceta.
     * @return the cantidad_ingrediente
     */
    public BigDecimal getCantidad_ingrediente() {
        return cantidad_ingrediente;
    }

    /**
     * Método para asignar un cantidad_ingrediente a un objeto IngredienteReceta.
     * @param cantidad_ingrediente the cantidad_ingrediente to set
     */
    public void setCantidad_ingrediente(BigDecimal cantidad_ingrediente) {
        java.math.BigDecimal oldCantidad_ingrediente = this.cantidad_ingrediente;
        this.cantidad_ingrediente = cantidad_ingrediente;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD_INGREDIENTE, oldCantidad_ingrediente, cantidad_ingrediente);
    }

}
