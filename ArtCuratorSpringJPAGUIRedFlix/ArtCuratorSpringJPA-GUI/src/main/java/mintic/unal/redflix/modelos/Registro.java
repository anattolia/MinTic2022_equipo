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
@Table(name = "registro")
public class Registro {
    
    @Id
    @GeneratedValue
    @Column(name = "reg_id")
    long regId;
    
    @Column(name = "reg_titulo")
    String regTitulo;
    
    @Column(name = "reg_alias")
    String regAlias;
    
   
    public Long getRegId() {
        return regId;
    }
    
    public void setRegId(Long regId) {
        this.regId = regId;
    }
    
    public String getRegTitulo() {
        return regTitulo;
    }

    public void setRegTitulo(String regTitulo) {
        this.regTitulo = regTitulo;
    }
   
    public String getRegAlias() {
        return regAlias;
    }

    public void setRegAlias(String regAlias) {
        this.regAlias = regAlias;
    }
    

    @Override
    public String toString() {
        return "Registro{" + "regId=" + regId + ", regTitulo=" + regTitulo 
                + ", regAlias=" + regAlias +'}';
    }    
    
}


