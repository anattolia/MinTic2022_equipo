/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.modelos;

import static java.awt.SystemColor.text;
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
@Table(name = "pelicula")
public class Pelicula {
    
    @Id
    @GeneratedValue
    @Column(name = "pel_id")
    long pelId;
    
    @Column(name = "pel_titulo")
    String pelTitulo;
    
    @Column(name = "pel_resumen")
    String pelResumen;
    
    @Column(name = "pel_anio")
    String pelAnio;
    
    @Column(name = "pel_director")
    String pelDirector;
    
    public Long getPelId() {
        return pelId;
    }
    
    public void setPelId(Long pelId) {
        this.pelId = pelId;
    }
    
    public String getPelTitulo() {
        return pelTitulo;
    }

    public void setPelTitulo(String pelTitulo) {
        this.pelTitulo = pelTitulo;
    }
    
    public String getPelResumen() {
        return pelResumen;
    }

    public void setPelResumen(String pelResumen) {
        this.pelResumen = pelResumen;
    }
    
    public String getPelAnio() {
        return pelAnio;
    }

    public void setPelAnio(String pelAnio) {
        this.pelAnio = pelAnio;
    }
    
    public void setPelDirector(String pelDirector) {
        this.pelDirector = pelDirector;
    }
    
    public String getPelDirector() {
        return pelDirector;
    }


    @Override
    public String toString() {
        return "Pelicula{" + "pelId=" + pelId + ", pelTitulo=" + pelTitulo 
                + ", pelResumen=" + pelResumen + ", pelAnio=" 
                + pelAnio + ", pelDirector=" + pelDirector +'}';
    }    
    
}