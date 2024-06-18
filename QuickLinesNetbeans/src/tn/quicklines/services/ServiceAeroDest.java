/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.quicklines.services;

import tn.quicklines.entities.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author houce
 */
public class ServiceAeroDest {
    private final String tableName="aero_dest";
    private final String dataBaseName="quicklines";
    private static final AeroDest jeton=new AeroDest();
    private static MyORM<AeroDest> orm =new MyORM<AeroDest>(jeton);
    
    public void create(AeroDest aeroDest) throws SQLException{
        orm.create(aeroDest, tableName);
    }
    public void update(AeroDest aeroDest) throws SQLException, IllegalAccessException{
        orm.update(aeroDest, dataBaseName, tableName);
    }
    /*public List<Entity> findByClientVol(int idVol, int idClient) throws SQLException, InstantiationException, IllegalAccessException{
        ArrayList<Object> values = new ArrayList();
        values.add(idVol);
        values.add(idClient);
        ArrayList<Integer> indexes = new ArrayList();
        values.add(3);
        values.add(6);
        return orm.findByArgs(jeton, tableName,orm.Args(jeton, indexes, values));
    }
    public List<Entity> findByVol(int idVol) throws SQLException, InstantiationException, IllegalAccessException{
        ArrayList<Object> values = new ArrayList();
        values.add(idVol);
        ArrayList<Integer> indexes = new ArrayList();
        values.add(3);
        return orm.findByArgs(jeton, tableName,orm.Args(jeton, indexes, values));
    }
    public List<Entity> findByClient(int idClient) throws SQLException, InstantiationException, IllegalAccessException{
        ArrayList<Object> values = new ArrayList();
        values.add(idClient);
        ArrayList<Integer> indexes = new ArrayList();
        values.add(6);
        return orm.findByArgs(jeton, tableName,orm.Args(jeton, indexes, values));
    }*/
    
    public List<Entity> findAll() throws SQLException, InstantiationException, IllegalAccessException{
        return orm.findAll(jeton, tableName);
    }
    public Entity findById(int id) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException{
        return orm.findById(id, jeton, tableName);
    }
    public Entity findByEntity(AeroDest aeroDest) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException{
        return orm.findByEntity(aeroDest, tableName);
    }
    public void delete(AeroDest aeroDest) throws SQLException, InstantiationException, IllegalAccessException{
        orm.delete(aeroDest, tableName);
    }
    
}
