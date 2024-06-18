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
import java.time.*;

/**
 *
 * @author houce
 */
public class Aeroport extends Entity {
    private int idAeroport;
    private String nomAeroport;
    private String codeAeroport;
    private String villeAeroport;

    public Aeroport() {
    }
    
    

    public Aeroport(String nomAeroport, String codeAeroport, String villeAeroport) {
        this.nomAeroport = nomAeroport;
        this.codeAeroport = codeAeroport;
        this.villeAeroport = villeAeroport;
    }
    
    

    public int getIdAeroport() {
        return idAeroport;
    }

    public String getNomAeroport() {
        return nomAeroport;
    }

    public void setNomAeroport(String nomAeroport) {
        this.nomAeroport = nomAeroport;
    }

    public String getCodeAeroport() {
        return codeAeroport;
    }

    public void setCodeAeroport(String codeAeroport) {
        this.codeAeroport = codeAeroport;
    }

    public String getVilleAeroport() {
        return villeAeroport;
    }

    public void setVilleAeroport(String villeAeroport) {
        this.villeAeroport = villeAeroport;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.idAeroport;
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
        final Aeroport other = (Aeroport) obj;
        if (this.idAeroport != other.idAeroport) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aeroport{" + "idAeroport=" + idAeroport + ", nomAeroport=" + nomAeroport + ", codeAeroport=" + codeAeroport + ", villeAeroport=" + villeAeroport + '}';
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
