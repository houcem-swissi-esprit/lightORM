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
public class User extends Entity{
    private int idUser;
    private String nomUser;
    private String prenomUser;
    private String emailUser;
    private String passwordUser;
    private int roleUser;
    private Date birthdateUser;
    private int airmilesUser;

    public User() {
    }

    public User(String nomUser, String prenomUser, String emailUser, String passwordUser, int roleUser, Date birthdateUser, int airmilesUser) {
        this.nomUser = nomUser;
        this.prenomUser = prenomUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.roleUser = roleUser;
        this.birthdateUser = birthdateUser;
        this.airmilesUser = airmilesUser;
    }
    

    public int getIdUser() {
        return idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public int getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(int roleUser) {
        this.roleUser = roleUser;
    }

    public Date getBirthdateUser() {
        return birthdateUser;
    }

    public void setBirthdateUser(Date birthdateUser) {
        this.birthdateUser = birthdateUser;
    }

    public int getAirmilesUser() {
        return airmilesUser;
    }

    public void setAirmilesUser(int airmilesUser) {
        this.airmilesUser = airmilesUser;
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
