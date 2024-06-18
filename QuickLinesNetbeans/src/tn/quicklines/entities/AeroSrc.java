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
public class AeroSrc extends Entity {
    private int idAeroSrc;
    private String nomAeroSrc;
    private String codeAeroSrc;
    private String villeAeroSrc;

    public AeroSrc() {
    }

    public AeroSrc(String nomAeroSrc, String codeAeroSrc, String villeAeroSrc) {
        this.nomAeroSrc = nomAeroSrc;
        this.codeAeroSrc = codeAeroSrc;
        this.villeAeroSrc = villeAeroSrc;
    }

    public int getIdAeroSrc() {
        return idAeroSrc;
    }

    public String getNomAeroSrc() {
        return nomAeroSrc;
    }

    public void setNomAeroSrc(String nomAeroSrc) {
        this.nomAeroSrc = nomAeroSrc;
    }

    public String getCodeAeroSrc() {
        return codeAeroSrc;
    }

    public void setCodeAeroSrc(String codeAeroSrc) {
        this.codeAeroSrc = codeAeroSrc;
    }

    public String getVilleAeroSrc() {
        return villeAeroSrc;
    }

    public void setVilleAeroSrc(String villeAeroSrc) {
        this.villeAeroSrc = villeAeroSrc;
    }

    @Override
    public String toString() {
        return "AeroSrc{" + "idAeroSrc=" + idAeroSrc + ", nomAeroSrc=" + nomAeroSrc + ", codeAeroSrc=" + codeAeroSrc + ", villeAeroSrc=" + villeAeroSrc + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idAeroSrc;
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
        final AeroSrc other = (AeroSrc) obj;
        if (this.idAeroSrc != other.idAeroSrc) {
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
