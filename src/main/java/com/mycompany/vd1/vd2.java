/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vd1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class vd2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so can tinh giai thua");
        int a;
        int gt=1;
        a=sc.nextInt();
        while(a>1){
        gt*=a;
        a--;
        }
        System.out.printf("Giai thua cua %d la %d",a,gt);
    }
}
