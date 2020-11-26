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
@Table(name = "serie")
public class Serie {
    
    @Id
    @GeneratedValue
    @Column(name = "ser_id")
    long serId;
    
    @Column(name = "ser_titulo")
    String serTitulo;
    
    @Column(name = "ser_episodios")
    int serEpisodios;
    
    @Column(name = "ser_temporadas")
    int serTemporadas;
    
    public Long getSerId() {
        return serId;
    }
    
    public void setSerId(Long serId) {
        this.serId = serId;
    }
    
    public String getSerTitulo() {
        return serTitulo;
    }

    public void setSerTitulo(String serTitulo) {
        this.serTitulo = serTitulo;
    }
    
    public int getSerEpisodios() {
        return serEpisodios;
    }

    public void setSerEpisodios(int serEpisodios) {
        this.serEpisodios = serEpisodios;
    }
    
    public int getSerTemporadas() {
        return serTemporadas;
    }

    public void setSerTemporadas(int serTemporadas) {
        this.serTemporadas = serTemporadas;
    }


    @Override
    public String toString() {
        return "Serie{" + "serId=" + serId + ", serTitulo=" + serTitulo 
                + ", serEpisodios=" + serEpisodios + ", serTemporadas=" 
                + serTemporadas + '}';
    }    
}

