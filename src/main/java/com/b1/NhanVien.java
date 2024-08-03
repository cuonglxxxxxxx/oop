/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.b1;

/**
 *
 * @author Lenovo
 */
public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public  double LUONG_MAX;

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }
    public double tinhLuong(){
     double luong;
     luong=this.luongCoBan*this.heSoLuong;
     return luong;
    }

    public boolean tangLuong(double x){
     double tang;
     tang=this.luongCoBan*(this.heSoLuong+x);
     if(tang>this.LUONG_MAX){
     return false;
     }else{
     this.heSoLuong+=x;
     }
     return true;
    }
    public void inTTin(){
        System.out.println("Thong tin nhan vien:");
        System.out.println("Ten nhan vien: "+this.tenNhanVien);
        System.out.println("He so luong: "+this.heSoLuong);
        System.out.println("Luong co ban: "+this.luongCoBan);
        System.out.println("Luong max: "+this.LUONG_MAX);
        System.out.println("Luong: "+ this.tinhLuong());
    }
}
