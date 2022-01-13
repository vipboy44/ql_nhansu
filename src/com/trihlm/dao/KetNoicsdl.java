/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trihlm.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author COMPUTER
 */
public class KetNoicsdl {
    Connection con = null;
    public KetNoicsdl()
    {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url ="jdbc:sqlserver://localhost:1433;databaseName=Polypro";
            con =DriverManager.getConnection(url,"sa","songlong");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
