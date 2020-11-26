/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue
    @Column(name = "usu_id")
    long usuId;
    
    @Column(name = "usu_nombre")
    String usuNombre;
    
    @Column(name = "usu_apellido")
    String usuApellido;
    
    @Column(name = "usu_email")
    String usuEmail;
    
    @Column(name = "usu_celular")
    String usuCelular;
    
    @Column(name = "usu_alias")
    String usuAlias;
    
    @Column(name = "usu_contrasena")
    String usuContrasena;
    
    @Column(name = "usu_nacimiento")
    String usuNacimiento;
    
    public Long getUsuId() {
        return usuId;
    }
    
    public void setUsuId(Long serId) {
        this.usuId = usuId;
    }
    
    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }
    
    public String getUsuApellido() {
        return usuApellido;
    }

    public void setUsuApellido(String usuApellido) {
        this.usuApellido = usuApellido;
    }
    
    public String getUsuEmail() {
        return usuEmail;
    }

    public void setUsuEmail(String usuEmail) {
        this.usuEmail = usuEmail;
    }

     public String getUsuCelular() {
        return usuCelular;
    }

    public void setUsuCelular(String usuCelular) {
        this.usuCelular = usuCelular;
    }
    
    public String getUsuAlias() {
        return usuAlias;
    }

    public void setUsuAlias(String usuAlias) {
        this.usuAlias = usuAlias;
    }
    
    public String getUsuContrasena() {
        return usuContrasena;
    }

    public void setUsuContrasena(String usuContrasena) {
        this.usuContrasena = usuContrasena;
    }
    
    public String getUsuNacimiento() {
        return usuNacimiento;
    }

    public void setUsuNacimiento(String usuNacimiento) {
        this.usuNacimiento = usuNacimiento;
    }
    
    

    @Override
    public String toString() {
        return "Usuario{" + "usuId=" + usuId + ", usuNombre=" + usuNombre 
                + ", usuApellido=" + usuApellido + ", usuEmail=" 
                + usuEmail + ", usuCelular=" + usuCelular 
                + ", usuAlias=" + usuAlias + ", usuContrasena=" 
                + usuContrasena + ", usuNacimiento=" 
                + usuNacimiento +'}';
    }    
}
