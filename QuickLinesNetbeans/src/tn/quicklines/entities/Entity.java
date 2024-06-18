/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.quicklines.entities;


import java.lang.*;
import java.util.*;
import java.io.*;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author houce
 * @param
 */
public abstract class Entity{
    /*public Entity(List<Object> args){
        for (int i=1 ; i<=(this.getClass().getDeclaredFields().length); i++){
            try {
                (this.getClass().getDeclaredFields())[i-1].set(i-1, args.get(i-1));
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(Entity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
    public abstract List<Object> getValues() throws IllegalArgumentException, IllegalAccessException , UnsupportedOperationException;/*{
        List<Object> values=new ArrayList<>();
        for (Field declaredField : this.getClass().getDeclaredFields()) {
            try {
                values.add(declaredField.get(this));
            }catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(Entity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return values;
    }*/
    public abstract void setValues(List<Object> rowValues) throws IllegalArgumentException, IllegalAccessException ;/*{
        for (int i=0;i<rowValues.size();i++){
            //if(this.getClass().getDeclaredFields()[i].getClass() )
            this.getClass().getDeclaredFields()[i].set(this, rowValues.get(i) );
        }
    }*/

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
        final Entity other = (Entity) obj;
        try {
            if (this.getValues() != other.getValues()) {
                return false;
            }
        } catch (IllegalArgumentException | IllegalAccessException | UnsupportedOperationException ex) {
            Logger.getLogger(Entity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}

