package models;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Alejandro Escobedo
 */
public class Usuario extends BaseModel{
    public static final String PROP_USUARIOID = "PROP_USUARIOID";
    public static final String PROP_USUARIO = "PROP_USUARIO";
    public static final String PROP_CONTRASENA = "PROP_CONTRASENA";
    
    private Integer usuarioId;
    
    private String usuario;
    
    private String contrasena;

    public Usuario() {
    }

    public Usuario(Integer usuarioId, String usuario, String contrasena) {
        this.usuarioId = usuarioId;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the usuarioId
     */
    public Integer getUsuarioId() {
        return usuarioId;
    }

    /**
     * @param usuarioId the usuarioId to set
     */
    public void setUsuarioId(Integer usuarioId) {
        java.lang.Integer oldUsuarioId = this.usuarioId;
        this.usuarioId = usuarioId;
        propertyChangeSupport.firePropertyChange(PROP_USUARIOID, oldUsuarioId, usuarioId);
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
