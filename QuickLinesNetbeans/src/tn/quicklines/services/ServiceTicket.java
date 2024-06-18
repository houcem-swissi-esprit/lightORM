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
public class ServiceTicket {
    private final String tableName="ticket";
    private final String dataBaseName="quicklines";
    private static final Ticket jeton=new Ticket();
    private static MyORM<Ticket> orm =new MyORM<Ticket>(jeton);
    
    public void create(Ticket ticket) throws SQLException{
        orm.create(ticket, tableName);
    }
    public void update(Ticket ticket) throws SQLException, IllegalAccessException{
        orm.update(ticket, dataBaseName, tableName);
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
    public Entity findByEntity(Ticket ticket) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException{
        return orm.findByEntity(ticket, tableName);
    }
    public void delete(Ticket ticket) throws SQLException, InstantiationException, IllegalAccessException{
        orm.delete(ticket, tableName);
    }
    
}
