/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;
import java.util.Scanner;
/**
 *
 * @author Lenovo
    interface QuanLy{
public double tinhHoaHong();
}
* implements QuanLy
 */

public class GiamDoc extends NhanVien implements QuanLy{
    private double phuCap;
    public double loiNhuanCongTy;
    Scanner sc=new Scanner(System.in);
    @Override
    public void nhapTT(){
    super.nhapTT();
        System.out.println("Nhap phu cap:");
        this.phuCap=sc.nextDouble();
        System.out.println("Nhap loi nhuan cong ty:");
        this.loiNhuanCongTy=sc.nextDouble();
    }
    @Override
    public double tinhHoaHong(){
    double hh;
    hh=this.loiNhuanCongTy*0.05;
    return hh;
    }
    @Override
    public double tinhLuong(){
    double luong;
    luong=super.tinhLuong()+this.phuCap+0.05*this.tinhHoaHong();
    return luong;
    }
    @Override
    public void inTTin(){
    super.inTTin();
        System.out.println("Phu cap:"+this.phuCap);
        System.out.println("Loi nhuan cong ty:"+this.loiNhuanCongTy);
    }

    public static void main(String[] args) {
        GiamDoc gd=new GiamDoc();
        gd.nhapTT();
        gd.inTTin();
    }
}
