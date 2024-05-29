
package com.vku.Model;


public class DSOrder {
    private String TenMon, MaMon, DVT; 
    private int Gia, SoLuong, MaHoaDon;
    
    public DSOrder(){
        TenMon = MaMon = DVT = "";
        Gia = SoLuong = MaHoaDon = 0;
    }
    public DSOrder(String mamon, String tenmon, String dvt, int soluong, int gia, int mahd){
        MaMon = mamon;
        MaHoaDon = mahd;
        TenMon = tenmon;
        DVT = dvt;
        Gia= gia;
        SoLuong = soluong;
    }
    public void SetMaHD(int mahd){
        MaHoaDon = mahd;
    }
    public int GetMaHD(){
        return MaHoaDon;
    }    
    public void SetMaMon(String mamon){
        this.MaMon=mamon;
    }
    public String GetMaMon(){
        return this.MaMon;
    }
    public void SetTenMon(String ten){
        this.TenMon=ten;
    }
    public String GetTenMon(){
        return this.TenMon;
    }    
    public void SetDVT(String dvt){
        this.DVT=dvt;
    }
    public String GetDVT(){
        return this.DVT;
    }
    public void SetSoLuong(int soluong){
        SoLuong = soluong;
    }
    public int GetSoLuong(){
        return SoLuong;
    }
    public void SetGia(int gia){
        Gia = gia;
    }
    public int GetGia(){
        return Gia;
    }    
}