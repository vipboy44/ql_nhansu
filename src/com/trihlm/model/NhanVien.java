/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trihlm.model;

/**
 *
 * @author COMPUTER
 */
public class NhanVien {

    private String maNV;
    private String matKhau;
    private String hoTen;
    private boolean vaiTro = false;

    public NhanVien() {
    }

    @Override
    public String toString() {
        return this.hoTen;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public NhanVien(String maNV, String matKhau, String hoTen) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
    }

}
