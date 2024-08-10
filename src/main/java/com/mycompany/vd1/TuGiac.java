/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vd1;
import com.quanly.Test;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class vd2 {
 protected Test d1,d2,d3,d4;
 public void setD1(Test _d1){d1=_d1;}
 public Test getD1(){return d1;}
 public vd2(Test p1,Test p2,Test p3,Test p4){
  d1=p1;
  d2=p2;
  d3=p3;
  d4=p4;
 }
 public vd2(){
d1 = new Test(); d2 = new Test(0,1);
d3 = new Test(1,1); d4 = new Test(1,0);
}
 public void inTuGiac(){
 d1.inDiem();
 d2.inDiem();
 d3.inDiem();
 d4.inDiem();
     System.out.println();
 }
}


