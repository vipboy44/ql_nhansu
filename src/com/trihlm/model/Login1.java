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
public class Login1 {
    String Username;
    String Pas;
    String vt;

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPas(String Pas) {
        this.Pas = Pas;
    }

    public void setVt(String vt) {
        this.vt = vt;
    }

    public String getUsername() {
        return Username;
    }

    public String getPas() {
        return Pas;
    }

    public String getVt() {
        return vt;
    }

    public Login1(String Username, String Pas, String vt) {
        this.Username = Username;
        this.Pas = Pas;
        this.vt = vt;
    }
   

    
}
