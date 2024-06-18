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
public class ServiceAeroport {
    private final String tableName="aeroport";
    private final String dataBaseName="quicklines";
    private static final Aeroport jeton=new Aeroport();
    private static MyORM<Aeroport> orm =new MyORM<Aeroport>(jeton);
    
    public void create(Aeroport aeroport) throws SQLException{
        orm.create(aeroport, tableName);
    }
    public void update(Aeroport aeroport) throws SQLException, IllegalAccessException{
        orm.update(aeroport, dataBaseName, tableName);
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
    public Entity findByEntity(Aeroport aeroport) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException{
        return orm.findByEntity(aeroport, tableName);
    }
    public void delete(Aeroport aeroport) throws SQLException, InstantiationException, IllegalAccessException{
        orm.delete(aeroport, tableName);
    }
    
}
