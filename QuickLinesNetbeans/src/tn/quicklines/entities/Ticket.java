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
public class Ticket extends Entity {
    private int idTicket;
    private String etatTicket;
    private LocalDateTime dateReservationTicket;
    private String nomPassagerTicket;
    private String prenomPassagerTicket;
    private double prixTicket;
    private String codeTicket;
    private int VolTicketId;
    private int ClientTicketId;
    


    public Ticket() {
    }

    public Ticket(String etatTicket, LocalDateTime dateReservationTicket, String nomPassagerTicket, String prenomPassagerTicket, double prixTicket, String codeTicket, int VolTicketId, int ClientTicketId) {
        this.etatTicket = etatTicket;
        this.dateReservationTicket = dateReservationTicket;
        this.nomPassagerTicket = nomPassagerTicket;
        this.prenomPassagerTicket = prenomPassagerTicket;
        this.prixTicket = prixTicket;
        this.codeTicket = codeTicket;
        this.VolTicketId = VolTicketId;
        this.ClientTicketId = ClientTicketId;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public String getEtatTicket() {
        return etatTicket;
    }

    public void setEtatTicket(String etatTicket) {
        this.etatTicket = etatTicket;
    }

    public LocalDateTime getDateReservationTicket() {
        return dateReservationTicket;
    }

    public void setDateReservationTicket(LocalDateTime dateReservationTicket) {
        this.dateReservationTicket = dateReservationTicket;
    }

    public String getNomPassagerTicket() {
        return nomPassagerTicket;
    }

    public void setNomPassagerTicket(String nomPassagerTicket) {
        this.nomPassagerTicket = nomPassagerTicket;
    }

    public String getPrenomPassagerTicket() {
        return prenomPassagerTicket;
    }

    public void setPrenomPassagerTicket(String prenomPassagerTicket) {
        this.prenomPassagerTicket = prenomPassagerTicket;
    }

    public double getPrixTicket() {
        return prixTicket;
    }

    public void setPrixTicket(double prixTicket) {
        this.prixTicket = prixTicket;
    }

    public String getCodeTicket() {
        return codeTicket;
    }

    public void setCodeTicket(String codeTicket) {
        this.codeTicket = codeTicket;
    }

    public int getVolTicketId() {
        return VolTicketId;
    }

    public void setVolTicketId(int VolTicketId) {
        this.VolTicketId = VolTicketId;
    }

    public int getClientTicketId() {
        return ClientTicketId;
    }

    public void setClientTicketId(int ClientTicketId) {
        this.ClientTicketId = ClientTicketId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idTicket;
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
        final Ticket other = (Ticket) obj;
        if (this.idTicket != other.idTicket) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", etatTicket=" + etatTicket + ", dateReservationTicket=" + dateReservationTicket + ", nomPassagerTicket=" + nomPassagerTicket + ", prenomPassagerTicket=" + prenomPassagerTicket + ", prixTicket=" + prixTicket + ", codeTicket=" + codeTicket + ", VolTicketId=" + VolTicketId + ", ClientTicketId=" + ClientTicketId + '}';
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
