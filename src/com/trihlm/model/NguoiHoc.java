/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trihlm.model;

import com.trihlm.helper.DateHelper;
import java.util.Date;

/**
 *
 * @author COMPUTER
 */
public class NguoiHoc {

    private String maNH;
    private String hoTen;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String dienThoai;
    private String email;
    private String ghiChu;
    private String maNV;
    private Date ngayDK = DateHelper.now();

    public NguoiHoc() {
        
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    public String getMaNH() {
        return maNH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public String getMaNV() {
        return maNV;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public NguoiHoc(String maNH, String hoTen, Date ngaySinh, boolean gioiTinh, String dienThoai, String email, String ghiChu, String maNV) {
        this.maNH = maNH;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ghiChu = ghiChu;
        this.maNV = maNV;
    }

    @Override
    public String toString() {
        return this.hoTen;
    }
}
