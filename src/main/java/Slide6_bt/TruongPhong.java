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
public class TruongPhong extends NhanVien {
    Scanner sc=new Scanner(System.in);
    private double phuCap;
    private double soNamDuongChuc;

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setSoNamDuongChuc(double soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }
    
    public double tinhLuong(){
    double luong=0;
    luong=super.tinhLuong()+this.phuCap;
    return luong;
    }
    
    @Override
    public void nhapTT(){
    super.nhapTT();
        System.out.println("Nhap phu cap cua truong phong: ");
        this.phuCap=sc.nextDouble();
        System.out.println("Nhap so nam duong chuc: ");
        this.soNamDuongChuc=sc.nextDouble();
    }
//    @Override
    /*
    public void inTTin(){
     super.inTTin();
        System.out.println("Phu cap:"+this.phuCap);
        System.out.println("So nam duong chuc:"+this.soNamDuongChuc);
    }
*/
    public static void main(String[] args) {
        TruongPhong tp=new TruongPhong();
        tp.nhapTT();
        tp.inTTin();
        
    }
}
