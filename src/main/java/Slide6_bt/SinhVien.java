/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;
import Slide6_bt.TuoiException;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class SinhVien {
    private String masv;
    private String hoten;
    private double diem;
    private int age;

    public SinhVien(String masv, String hoten, double diem, int age) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.age = age;
    }

    public SinhVien() {
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + ", age=" + age + '}';
    }
    public void nhapTTin(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien: ");
        this.masv=sc.nextLine();
        System.out.println("Nhap ho ten: ");
        sc.next();
        this.hoten=sc.nextLine();
        while(true){
        try{
        System.out.println("Nhap diem: ");
        this.diem=sc.nextDouble();
        if(this.diem<0 || this.diem>10 ){
        throw new TuoiException("Tuoi nhap vao khong hop le.");
        }else{
        break;
        }
        }catch(TuoiException te){
                System.out.println(te.getMessage());
                }
        }
        
        System.out.println("Nhap tuoi: ");
        this.age=sc.nextInt();
}
    public void inTTin(){
        System.out.println(this.toString());
    }
    public static void main(String[] args) {
        SinhVien sv=new SinhVien();

        sv.nhapTTin();
        sv.inTTin();
    }
}
