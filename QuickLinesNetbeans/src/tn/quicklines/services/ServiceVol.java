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
public class ServiceVol {
    private final String tableName="vol";
    private final String dataBaseName="quicklines";
    private static final Vol jeton=new Vol();
    private static MyORM<Vol> orm =new MyORM<Vol>(jeton);
    
    public void create(Vol vol) throws SQLException{
        orm.create(vol, tableName);
    }
    public void update(Vol vol) throws SQLException, IllegalAccessException{
        orm.update(vol, dataBaseName, tableName);
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
    public Entity findByEntity(Vol vol) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException{
        return orm.findByEntity(vol, tableName);
    }
    public void delete(Vol vol) throws SQLException, InstantiationException, IllegalAccessException{
        orm.delete(vol, tableName);
    }
    
}
