/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quanly;

import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class SinhVien {
    private String tenSinhVien;
    private int namSinh;
    private String queQuan;
    private double chieuCao;
    private double canNang;
    public SinhVien(String ten,int nam,String que,double cao,double nang){
    this.tenSinhVien=ten;
    this.queQuan=que;
    this.canNang=nang;
    this.chieuCao=cao;
    this.namSinh=nam;
    }
    public SinhVien(){
    this.tenSinhVien="No name";
    this.namSinh=2000;
    this.chieuCao=1.75;
    this.canNang=74;
    this.queQuan="Chua xac dinh";
    }
    public void inThongTin (){
        System.out.println("Thong tin sinh vien:");
        System.out.println("Ho ten: "+this.tenSinhVien);
        System.out.println("Nam sinh: "+this.namSinh);
        System.out.println("Que quan: "+this.queQuan);
        System.out.println("Chieu cao: "+this.chieuCao);
        System.out.println("Can nang: "+this.canNang);
    }
    public String gettenSinhVien(){
      return this.tenSinhVien;
    }
    public void settenSinhVien(String ten){
     this.tenSinhVien=ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (this.namSinh != other.namSinh) {
            return false;
        }
        if (Double.doubleToLongBits(this.chieuCao) != Double.doubleToLongBits(other.chieuCao)) {
            return false;
        }
        if (Double.doubleToLongBits(this.canNang) != Double.doubleToLongBits(other.canNang)) {
            return false;
        }
        if (!Objects.equals(this.tenSinhVien, other.tenSinhVien)) {
            return false;
        }
        return Objects.equals(this.queQuan, other.queQuan);
    }
    
}
