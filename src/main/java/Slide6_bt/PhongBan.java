/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;

/**
 *
 * @author Lenovo
 */
public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    public static final byte SO_NV_MAX=100;
    public NhanVien[] dsnv=new NhanVien[100];
    public PhongBan(){
    this.soNhanVien=0;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public byte getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(byte soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public NhanVien[] getDsnv() {
        return dsnv;
    }

    public void setDsnv(NhanVien[] dsnv) {
        this.dsnv = dsnv;
    }
    
    public PhongBan(String tenPhongBan, byte soNhanVien) {
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = soNhanVien;
    }
    public void themNV(){
     if(this.soNhanVien>=100){
         System.out.println("Phong da day");
     }else {
     NhanVien nv=new NhanVien();
     nv.nhapTT();
     dsnv[this.soNhanVien]=nv;
     this.soNhanVien++;
     }
    }
    public void xoaNV(){
    NhanVien tmp=new NhanVien();
    if(this.soNhanVien>0){
    tmp=dsnv[this.soNhanVien-1];
    dsnv[this.soNhanVien-1]=null;
    this.soNhanVien--;
    tmp.inTTin();
    }else
    {System.out.println("Phong ban chua co nhan vien");}
    }
    public double tongLuong(){
    double tong=0.0;
    for(int i=0;i<this.soNhanVien;i++){
    tong+=dsnv[i].tinhLuong();
    }
    return tong;
    }
    public void inTTin(){
        System.out.println("----------Phong "+this.tenPhongBan+"----------");
        System.out.println("So luong nhan vien: "+this.soNhanVien);
        for(int i=0;i<this.soNhanVien;i++){
            System.out.println("Nhan vien "+(i+1));
            dsnv[i].inTTin();
        }
    }    
    
}
