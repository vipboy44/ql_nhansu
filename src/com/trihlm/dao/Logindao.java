/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trihlm.dao;

import com.trihlm.helper.JdbcHelper;
import com.trihlm.model.Login1;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author COMPUTER
 */
public class Logindao extends KetNoicsdl{
     ArrayList<Login1> list = new ArrayList<Login1>();
        public ArrayList<Login1> LoadDataToArray()
        {
            try {
                 String sql = "select * from NhanVien";
                  Statement st = con.createStatement();
                  ResultSet rs = st.executeQuery(sql);
                   while (rs.next()) {                
                String Username = rs.getString(1);
                String Pas = rs.getString(2);
                String vt = rs.getString(3);
                Login1 lg = new Login1(Username,Pas,vt);
                list.add(lg);
            }
            } catch (Exception e) {
            }
            return list;
        } 
}
