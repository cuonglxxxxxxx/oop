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
public class NoiThanh extends ChuyenXe {
    protected int soTuyen;
    protected double soKm;
    public static double tongDoanhThuNoiT;
    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }

    public NoiThanh() {

    }

    public NoiThanh(int soTuyen, double soKm, String ten, int xe, String ma, double doanhthu) {
        super(ten, xe, ma, doanhthu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    
    @Override
   public void nhapThongTin(){
     
    super.nhapThongTin();
        System.out.println("Nhap so tuyen: ");
        Scanner sc1=new Scanner(System.in);
        this.soTuyen=sc1.nextInt();
        System.out.println("Nhap so km di duoc: ");
        this.soKm=sc1.nextDouble();
        tongDoanhThuNoiT+=this.doanhThu;
   }
    @Override
   public void inThongTin(){
   super.inThongTin();
        System.out.println("So tuyen: "+this.soTuyen);
        System.out.println("So km: "+this.soKm);
   }
}
