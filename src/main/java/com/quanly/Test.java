/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quanly;
import java.util.Scanner;
import com.quanly.SinhVien;
/**
 *
 * @author Lenovo
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("So sv can nhap: ");
        int n=sc.nextInt();
        SinhVien[] sv=new SinhVien[n];
        for (int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Nhap ten sv: ");
            String ten=sc.nextLine();
            System.out.println("Nhap que sv: ");
            String que=sc.nextLine();
            System.out.println("Nhap nam sinh: ");
            int nam=sc.nextInt();
            System.out.println("Nhap chieu cao: ");
            double cao=sc.nextDouble();
            System.out.println("Nhap can nangL ");
            double nang=sc.nextDouble();
            sv[i]=new SinhVien(ten,nam,que,cao,nang);
        }
        sc.close();
        int tong=0;
        for(int i=0;i<n;i++){
        tong+=2024-sv[i].getNamSinh();
            System.out.printf("%d:%s\n",i+1,sv[i].gettenSinhVien());
        }
        System.out.println("Tong so tuoi cua lop sv la:"+tong);
    }
}
