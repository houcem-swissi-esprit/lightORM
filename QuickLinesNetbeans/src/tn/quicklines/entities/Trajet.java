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
import java.sql.*;
/**
 *
 * @author houce
 */
public class Trajet extends Entity {
    private int idTrajet;
    private String nomTrajet;
    private String codeTrajet;
    private int lengthTrajet;
    private int aeroSrcTrajetId;
    private int aeroDestTrjaetId;

    public Trajet() {
    }

    public Trajet(String nomTrajet, String codeTrajet, int lengthTrajet, int aeroSrcTrajetId, int aeroDestTrjaetId) {
        this.nomTrajet = nomTrajet;
        this.codeTrajet = codeTrajet;
        this.lengthTrajet = lengthTrajet;
        this.aeroSrcTrajetId = aeroSrcTrajetId;
        this.aeroDestTrjaetId = aeroDestTrjaetId;
    }

    public int getIdTrajet() {
        return idTrajet;
    }

    public String getNomTrajet() {
        return nomTrajet;
    }

    public void setNomTrajet(String nomTrajet) {
        this.nomTrajet = nomTrajet;
    }

    public String getCodeTrajet() {
        return codeTrajet;
    }

    public void setCodeTrajet(String codeTrajet) {
        this.codeTrajet = codeTrajet;
    }

    public int getLengthTrajet() {
        return lengthTrajet;
    }

    public void setLengthTrajet(int lengthTrajet) {
        this.lengthTrajet = lengthTrajet;
    }

    public int getAeroSrcTrajetId() {
        return aeroSrcTrajetId;
    }

    public void setAeroSrcTrajetId(int aeroSrcTrajetId) {
        this.aeroSrcTrajetId = aeroSrcTrajetId;
    }

    public int getAeroDestTrjaetId() {
        return aeroDestTrjaetId;
    }

    public void setAeroDestTrjaetId(int aeroDestTrjaetId) {
        this.aeroDestTrjaetId = aeroDestTrjaetId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idTrajet;
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
        final Trajet other = (Trajet) obj;
        if (this.idTrajet != other.idTrajet) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trajet{" + "idTrajet=" + idTrajet + ", nomTrajet=" + nomTrajet + ", codeTrajet=" + codeTrajet + ", lengthTrajet=" + lengthTrajet + ", aeroSrcTrajetId=" + aeroSrcTrajetId + ", aeroDestTrjaetId=" + aeroDestTrjaetId + '}';
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
        return values;
    } //To change body of generated methods, choose Tools | Templates.
    

    @Override
    public void setValues(List<Object> rowValues) throws IllegalArgumentException, IllegalAccessException {
        for (int i=0;i<rowValues.size();i++){
            //if(this.getClass().getDeclaredFields()[i].getClass() )
            this.getClass().getDeclaredFields()[i].set(this, rowValues.get(i) );
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
