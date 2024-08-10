/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vd1;
import com.quanly.Diem;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class TuGiac {
 protected Diem d1,d2,d3,d4;
 public void setD1(Diem _d1){d1=_d1;}
 public Diem  getD1(){return d1;}
 public  TuGiac (Diem p1,Diem p2,Diem p3,Diem p4){
  d1=p1;
  d2=p2;
  d3=p3;
  d4=p4;
 }
 public TuGiac(String a){
     System.out.println("Le Xuan Cuong");
}
 public void inTuGiac(){
 d1.inDiem();
 d2.inDiem();
 d3.inDiem();
 d4.inDiem();
     System.out.println();
 }
}


