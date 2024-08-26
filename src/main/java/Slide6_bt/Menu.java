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
public class Menu {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);   
        System.out.println("NHap ten phong ban: ");
    PhongBan pb=new PhongBan();
    pb.setTenPhongBan(sc.nextLine());
    int luachon=0;
    do{
            System.out.println("---Quan ly phong ban---");
            System.out.println("\t1.Them nhan vien ");
            System.out.println("\t2.Xoa nhan vien");
            System.out.println("\t3.Tinh tong luong");
            System.out.println("\t4.In thong tin");
            System.out.println("\t5.Ket thuc chuong trinh");
            System.out.println("Nhap lua chon [1-5]");
            
            luachon=sc.nextInt();
            switch (luachon){
                case 1:
                    pb.themNV();
                    break;
                case 2:
                    pb.xoaNV();
                    break;
                case 3:
                    System.out.println("Tong luong cua phong la: "+pb.tongLuong());
                    break;
                case 4:
                    pb.inTTin();
                    break;
                case 5:
                    System.out.println("-----Chuong trinh ket thuc-----");
                    break;
                default:
                    System.out.println("Lua chon khong co trong danh sach");
            }
}while(luachon!=5);
    }
        }
