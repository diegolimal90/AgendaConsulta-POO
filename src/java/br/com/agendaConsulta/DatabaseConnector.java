/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendaConsulta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author cassi
 */
public class DatabaseConnector {

    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String URL = "jdbc:derby://localhost:1527/agendaCons";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static ArrayList<Object[]> getQuery (String SQL, Object[] parameters)
        throws Exception{
    
        ArrayList<Object[]> List = new ArrayList<>();
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement stmt = con.prepareStatement(SQL);
        for (int i = 0; i < parameters.length; i++){
            stmt.setObject(i+1,parameters[i]);
        }
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
        Object row [] = new Object[rs.getMetaData().getColumnCount()];
            int i;
        for(i = 0; i < rs.getMetaData().getColumnCount(); i++ ){
        row[i] = rs.getObject(i+1);
            
        }
        List.add(row);
        
        }
        rs.close();stmt.close();con.close();
        return List;
        
    }
    
    public static void execute(String SQL, Object[] parameters)
        throws Exception{
    
        ArrayList<Object[]> List = new ArrayList<>();
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement stmt = con.prepareStatement(SQL);
        for (int i = 0; i < parameters.length; i++){
            stmt.setObject(i+1,parameters[i]);
        }
        stmt.execute();
        stmt.close();
        con.close();
    }
    
}

