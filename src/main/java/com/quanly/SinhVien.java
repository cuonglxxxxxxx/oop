/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quanly;

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
    
}
