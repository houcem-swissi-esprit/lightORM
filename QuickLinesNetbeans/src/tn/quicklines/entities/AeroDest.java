/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.quicklines.entities;


import java.util.List;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;

/**
 *
 * @author houce
 */
public class AeroDest extends Entity {
    private int idAeroDest;
    private String nomAeroDest;
    private String codeAeroDest;
    private String villeAeroDest;

    public AeroDest() {
    }

    public AeroDest(String nomAeroDest, String codeAeroDest, String villeAeroDest) {
        this.nomAeroDest = nomAeroDest;
        this.codeAeroDest = codeAeroDest;
        this.villeAeroDest = villeAeroDest;
    }

    public int getIdAeroDest() {
        return idAeroDest;
    }

    public String getNomAeroDest() {
        return nomAeroDest;
    }

    public void setNomAeroDest(String nomAeroDest) {
        this.nomAeroDest = nomAeroDest;
    }

    public String getCodeAeroDest() {
        return codeAeroDest;
    }

    public void setCodeAeroDest(String codeAeroDest) {
        this.codeAeroDest = codeAeroDest;
    }

    public String getVilleAeroDest() {
        return villeAeroDest;
    }

    public void setVilleAeroDest(String villeAeroDest) {
        this.villeAeroDest = villeAeroDest;
    }

    @Override
    public String toString() {
        return "AeroDest{" + "idAeroDest=" + idAeroDest + ", nomAeroDest=" + nomAeroDest + ", codeAeroDest=" + codeAeroDest + ", villeAeroDest=" + villeAeroDest + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idAeroDest;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AeroDest other = (AeroDest) obj;
        if (this.idAeroDest != other.idAeroDest) {
            return false;
        }
        return true;
    }
    

    @Override
    public List<Object> getValues() throws IllegalArgumentException, IllegalAccessException, UnsupportedOperationException {
        List<Object> values=new ArrayList<>();
        for (Field declaredField : this.getClass().getDeclaredFields()) {
            try {
                values.add(declaredField.get(this));
            }catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(Entity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return values; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValues(List<Object> rowValues) throws IllegalArgumentException, IllegalAccessException {
        for (int i=0;i<rowValues.size();i++){
            //if(this.getClass().getDeclaredFields()[i].getClass() )
            this.getClass().getDeclaredFields()[i].set(this, rowValues.get(i) );
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
