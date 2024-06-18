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
public class Transaction extends Entity {
    private int idTransaction;
    private String etatTransaction;
    private int discountTransaction;
    private double prixTransaction;
    private LocalDateTime dateTransaction;
    private int ticketTransactionId;

    public Transaction() {
    }

    public Transaction(String etatTransaction, int discountTransaction, double prixTransaction, LocalDateTime dateTransaction, int ticketTransactionId) {
        this.etatTransaction = etatTransaction;
        this.discountTransaction = discountTransaction;
        this.prixTransaction = prixTransaction;
        this.dateTransaction = dateTransaction;
        this.ticketTransactionId = ticketTransactionId;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public String getEtatTransaction() {
        return etatTransaction;
    }

    public void setEtatTransaction(String etatTransaction) {
        this.etatTransaction = etatTransaction;
    }

    public int getDiscountTransaction() {
        return discountTransaction;
    }

    public void setDiscountTransaction(int discountTransaction) {
        this.discountTransaction = discountTransaction;
    }

    public double getPrixTransaction() {
        return prixTransaction;
    }

    public void setPrixTransaction(double prixTransaction) {
        this.prixTransaction = prixTransaction;
    }

    public LocalDateTime getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(LocalDateTime dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public int getTicketTransactionId() {
        return ticketTransactionId;
    }

    public void setTicketTransactionId(int ticketTransactionId) {
        this.ticketTransactionId = ticketTransactionId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idTransaction;
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
        final Transaction other = (Transaction) obj;
        if (this.idTransaction != other.idTransaction) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transaction{" + "idTransaction=" + idTransaction + ", etatTransaction=" + etatTransaction + ", discountTransaction=" + discountTransaction + ", prixTransaction=" + prixTransaction + ", dateTransaction=" + dateTransaction + ", ticketTransactionId=" + ticketTransactionId + '}';
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
