/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vku.MODEL;

/**
 *
 * @author admin!
 */
public class Taikhoan {
    private String id;
    private String username;
    private String password;
    private String lv;
    
    public Taikhoan(){
        
    }

    public Taikhoan(String id, String username, String password, String lv) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.lv = lv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    @Override
    public String toString() {
        return "Taikhoan{" + "id=" + id + ", username=" + username + ", password=" + password + ", lv=" + lv + '}';
    }
    
}
