/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vd6_b1;

/**
 *
 * @author Lenovo
 */
public class DanhSachChuyenXe {
    public ChuyenXe[] chuyenxe=new ChuyenXe[100];
    public int soLuongCX;
    public DanhSachChuyenXe(){
    this.soLuongCX=0;
    }
    public void themCX(int loai){
    //loai=1 noi thanh
    //loai=2 ngoai thanh
    //kiem tra so luon cx vuot qua 100 khong them nua
    if(this.soLuongCX>100){
        System.out.println("Dat toi gioi han cho phep: ");
    }else {
           if(loai==1){
            NoiThanh nt1=new NoiThanh();
            nt1.nhapThongTin();
            this.chuyenxe[this.soLuongCX]=nt1;
            this.soLuongCX++;
           }else if(loai==2){
               NgoaiThanh nt2=new NgoaiThanh();
               nt2.nhapThongTin();
               this.chuyenxe[this.soLuongCX]=nt2;
               this.soLuongCX++;
           }else {
               System.out.println("Loai chuyen xe khong ton tai: ");
           }
    }
    }
    public void inDS(){
        System.out.println("----****Danh sach chuyen xe hien co****----");
     for(int i=0;i<this.soLuongCX;i++){
         System.out.println("---Xe thu "+(i+1));
         this.chuyenxe[i].inThongTin();
     }
        System.out.println("-----/-----/-----");
        System.out.println("Doanh thu noi thanh: "+NoiThanh.tongDoanhThuNoiT);
        System.out.println("Doanh thu ngoai thanh: "+NgoaiThanh.tongDoanhThuNgoaiT);
    }
}
