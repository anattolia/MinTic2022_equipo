/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "director")
public class Director {
    @Id
    @GeneratedValue
    @Column(name = "dir_id")
    long dirId;
    
    @Column(name = "dir_nombre")
    String dirNombre;
    
    @Column(name = "dir_apellido")
    String dirApellido;
    
    @Column(name = "dir_nacionalidad")
    String dirNacionalidad;
    
    public Long getDirId() {
        return dirId;
    }
    
    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }
    
    public String getDirNombre() {
        return dirNombre;
    }

    public void setDirNombre(String dirNombre) {
        this.dirNombre = dirNombre;
    }
    
    public String getDirApellido() {
        return dirApellido;
    }

    public void setDirApellido(String dirApellido) {
        this.dirApellido = dirApellido;
    }
    
    public String getDirNacionalidad() {
        return dirNacionalidad;
    }

    public void setDirNacionalidad(String dirNacionalidad) {
        this.dirNacionalidad = dirNacionalidad;
    }


    @Override
    public String toString() {
        return "Director{" + "dirId=" + dirId + ", dirNombre=" + dirNombre 
                + ", dirApellido=" + dirApellido + ", dirNacionalidad=" 
                + dirNacionalidad + '}';
    }    
}
