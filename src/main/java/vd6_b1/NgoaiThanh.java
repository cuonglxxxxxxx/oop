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
public class NgoaiThanh extends ChuyenXe {
    protected String noiDen;
    protected int soNgayDi;
    public static double tongDoanhThuNgoaiT;
    public NgoaiThanh(String ten,double doanhthu,int xe,String ma,String noiden,int songay){
    super(ten,xe,ma,doanhthu);
    
    noiDen=noiden;
    soNgayDi=songay;
    }

    public NgoaiThanh() {}

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public NgoaiThanh(String noiDen, int soNgayDi, String ten, int xe, String ma, double doanhthu) {
        super(ten, xe, ma, doanhthu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
        @Override
   public void nhapThongTin(){
     
    super.nhapThongTin();
        System.out.println("Nhap noi den: ");
        Scanner sc1=new Scanner(System.in);
        this.noiDen=sc1.nextLine();
        System.out.println("Nhap so ngay di: ");
        this.soNgayDi=sc1.nextInt();
        tongDoanhThuNgoaiT+=this.doanhThu;
   }
    @Override
   public void inThongTin(){
   super.inThongTin();
        System.out.println("Noi den: "+this.noiDen);
        System.out.println("So ngay di: "+this.soNgayDi);
   }
}
