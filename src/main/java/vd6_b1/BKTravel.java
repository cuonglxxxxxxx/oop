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
public class BKTravel {
    public static void main(String[] args) {
    Scanner sc2=new Scanner(System.in);
    DanhSachChuyenXe ds=new DanhSachChuyenXe();
    int luachon=0;
    do{
        System.out.println("--------Bach Khoa Travel--------");
        System.out.println("\t1.Them chuyen xe noi thanh: ");
        System.out.println("\t2.Them chuyen xe ngoai thanh: ");
        System.out.println("\t3.Hien thi danh sach chuyen xe: ");
        System.out.println("\t4.Thoat chuong trinh: ");
        System.out.println("Nhap lua chon [1-4]: ");
        luachon=sc2.nextInt();
        switch(luachon){
            case 1:
                ds.themCX(1);
                break;
            case 2:
                ds.themCX(2);
                break;
            case 3:
                ds.inDS();
                break;
            case 4:
                System.out.println("---Chuong trinh da ket thuc---");
                break;
            default:
                System.out.println("Vui long nhap lua chon co trong danh sach: ");
        }
    }while(luachon!=4);
    }
}
