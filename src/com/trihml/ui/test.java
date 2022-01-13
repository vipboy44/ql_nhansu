/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trihml.ui;

import com.trihlm.helper.JdbcHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author COMPUTER
 */
public class test 
{
    public static void main(String[] args) throws SQLException {
        JdbcHelper.executeUpdate("INSERT dbo.NhanVien VALUES (?, ?, ?, ?)", "NhanVien1", "123456", "Ho Ten", true);
        JdbcHelper.executeUpdate("update NhanVien set MatKhau=?, HoTen=?, VaiTro=? Where MaNV=?","123","ABC",false,"NhanVien2");
        JdbcHelper.executeUpdate("delete from nhanvien where MaNV=?","NhanVien1");
      
    }
    
}
