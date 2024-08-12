/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vd6_b1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class ChuyenXe {
    protected String hoTenTaiXe;
    protected int soXe;
    protected String maSoChuyen;
    protected double doanhThu;
    public ChuyenXe(){};
    public ChuyenXe(String ten,int xe,String ma,double doanhthu){
     this.doanhThu=doanhthu;
     hoTenTaiXe=ten;
     soXe=xe;
     maSoChuyen=ma;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten tai xe: ");
        this.hoTenTaiXe=sc.nextLine();
        System.out.println("Nhap so xe: ");
        this.soXe=sc.nextInt();
        System.out.println("Nhap ma so chuyen: " );
        sc.nextLine();
        this.maSoChuyen=sc.nextLine();
        System.out.println("Nhap doanh thu: ");
        this.doanhThu=sc.nextDouble();
    }
    public void inThongTin(){
        System.out.println("Tai xe:"+this.hoTenTaiXe);
        System.out.println("So xe: "+this.soXe);
        System.out.println("Ma so chuyen: "+this.maSoChuyen);
        System.out.println("Doanh thu: "+this.doanhThu);
    }
    
}
