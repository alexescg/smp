package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 *
 * @author Alejandro Escobedo
 */
public class Usuario extends BaseModel{    
    public static final String PROP_ID_USUARIO = "PROP_ID_USUARIO";
    public static final String PROP_USUARIO = "PROP_USUARIO";
    public static final String PROP_CONTRASENA = "PROP_CONTRASENA";
    private BigDecimal id_usuario;
    
    private String usuario;
    
    private String contrasena;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the id_usuario
     */
    public BigDecimal getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(BigDecimal id_usuario) {
        java.math.BigDecimal oldId_usuario = this.id_usuario;
        this.id_usuario = id_usuario;
        propertyChangeSupport.firePropertyChange(PROP_ID_USUARIO, oldId_usuario, id_usuario);
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        java.lang.String oldUsuario = this.usuario;
        this.usuario = usuario;
        propertyChangeSupport.firePropertyChange(PROP_USUARIO, oldUsuario, usuario);
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        java.lang.String oldContrasena = this.contrasena;
        this.contrasena = contrasena;
        propertyChangeSupport.firePropertyChange(PROP_CONTRASENA, oldContrasena, contrasena);
    }
}
