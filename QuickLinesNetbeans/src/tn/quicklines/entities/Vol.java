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
import java.time.*;

/**
 *
 * @author houce
 */
public class Vol extends Entity {
    private int idVol ;
    private Date dateAllerVol;
    private Date dateRetourVol;
    private LocalDateTime departAllerVol;
    private LocalDateTime arriveeAllerVol; 
    private LocalDateTime departRetourVol;
    private LocalDateTime arriveeRetourVol; 
    private double prixVol;
    private String modelAvionVol;
    private int totalSiegesVol;
    private int trajetVolId;

    public Vol() {
    }

    public Vol(Date dateAllerVol, Date dateRetourVol, LocalDateTime departAllerVol, LocalDateTime arriveeAllerVol, LocalDateTime departRetourVol, LocalDateTime arriveeRetourVol, double prixVol, String modelAvionVol, int totalSiegesVol, int trajetVolId) {
        this.dateAllerVol = dateAllerVol;
        this.dateRetourVol = dateRetourVol;
        this.departAllerVol = departAllerVol;
        this.arriveeAllerVol = arriveeAllerVol;
        this.departRetourVol = departRetourVol;
        this.arriveeRetourVol = arriveeRetourVol;
        this.prixVol = prixVol;
        this.modelAvionVol = modelAvionVol;
        this.totalSiegesVol = totalSiegesVol;
        this.trajetVolId = trajetVolId;
    }

    public int getIdVol() {
        return idVol;
    }

    public Date getDateAllerVol() {
        return dateAllerVol;
    }

    public void setDateAllerVol(Date dateAllerVol) {
        this.dateAllerVol = dateAllerVol;
    }

    public Date getDateRetourVol() {
        return dateRetourVol;
    }

    public void setDateRetourVol(Date dateRetourVol) {
        this.dateRetourVol = dateRetourVol;
    }

    public LocalDateTime getDepartAllerVol() {
        return departAllerVol;
    }

    public void setDepartAllerVol(LocalDateTime departAllerVol) {
        this.departAllerVol = departAllerVol;
    }

    public LocalDateTime getArriveeAllerVol() {
        return arriveeAllerVol;
    }

    public void setArriveeAllerVol(LocalDateTime arriveeAllerVol) {
        this.arriveeAllerVol = arriveeAllerVol;
    }

    public LocalDateTime getDepartRetourVol() {
        return departRetourVol;
    }

    public void setDepartRetourVol(LocalDateTime departRetourVol) {
        this.departRetourVol = departRetourVol;
    }

    public LocalDateTime getArriveeRetourVol() {
        return arriveeRetourVol;
    }

    public void setArriveeRetourVol(LocalDateTime arriveeRetourVol) {
        this.arriveeRetourVol = arriveeRetourVol;
    }

    public double getPrixVol() {
        return prixVol;
    }

    public void setPrixVol(double prixVol) {
        this.prixVol = prixVol;
    }

    public String getModelAvionVol() {
        return modelAvionVol;
    }

    public void setModelAvionVol(String modelAvionVol) {
        this.modelAvionVol = modelAvionVol;
    }

    public int getTotalSiegesVol() {
        return totalSiegesVol;
    }

    public void setTotalSiegesVol(int totalSiegesVol) {
        this.totalSiegesVol = totalSiegesVol;
    }

    public int getTrajetVolId() {
        return trajetVolId;
    }

    public void setTrajetVolId(int trajetVolId) {
        this.trajetVolId = trajetVolId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.idVol;
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
        final Vol other = (Vol) obj;
        if (this.idVol != other.idVol) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vol{" + "idVol=" + idVol + ", dateAllerVol=" + dateAllerVol + ", dateRetourVol=" + dateRetourVol + ", departAllerVol=" + departAllerVol + ", arriveeAllerVol=" + arriveeAllerVol + ", departRetourVol=" + departRetourVol + ", arriveeRetourVol=" + arriveeRetourVol + ", prixVol=" + prixVol + ", modelAvionVol=" + modelAvionVol + ", totalSiegesVol=" + totalSiegesVol + ", trajetVolId=" + trajetVolId + '}';
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
