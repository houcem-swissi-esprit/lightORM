/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.quicklines.services;

/**
 *
 * @author houce
 */
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author houce
 * @param <T>
 */
public interface IORM <T>{
    public ResultSetMetaData rsmd(T jeton,String tableName) throws SQLException;
    public void create(T t,String tableName)throws SQLException;
    public void update(T t,String dataBaseName,String tableName)throws SQLException,IllegalAccessException;
    public T findByEntity(T t,String tableName) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException;
    public T findById(int id,T jeton,String tableName) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException;
    public HashMap<Integer,Object> Args(T jeton, ArrayList<Integer> indexes, ArrayList<Object> values );
    public List<T> findByArgs(T jeton,String tableName,HashMap<Integer,Object> args) throws SQLException,InstantiationException,IllegalAccessException;
    public List<T> findAll(T jeton,String tableName) throws SQLException,InstantiationException,IllegalAccessException;
    public void delete(T t,String tableName) throws SQLException,InstantiationException,IllegalAccessException;
    
}
