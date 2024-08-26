/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */

public class NhanVien {
    private String tenNhanVien;
    private double heSoLuong;
    public static final double LUONG_CO_BAN=750000;
    public static final double LUONG_MAX=20000000;

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }
    public NhanVien(){}
    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }
    public void nhapTT(){
    Scanner sc1=new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        this.tenNhanVien=sc1.nextLine();
        System.out.println("Nhap he so luong: ");
        this.heSoLuong=sc1.nextDouble();
    }
    
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
     public double tinhLuong(){
     double luong;
     luong=LUONG_CO_BAN*this.heSoLuong;
     return luong;
    }

    public boolean tangLuong(double x){
     double tang;
     tang=LUONG_CO_BAN*(this.heSoLuong+x);
     if(tang>LUONG_MAX){
     return false;
     }else{
     this.heSoLuong+=x;
     }
     return true;
    }

    public void inTTin(){
        System.out.println("Thong tin:");
        System.out.println("Ten: "+this.tenNhanVien);
        System.out.println("He so luong: "+this.heSoLuong);
        System.out.println("Luong co ban: "+LUONG_CO_BAN);
        System.out.println("Luong max: "+LUONG_MAX);
        System.out.println("Luong: "+ this.tinhLuong());
    }
}
