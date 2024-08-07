
package com.mycompany.vd1;
import java.util.Scanner;
import com.quanly.SinhVien;
import com.quanly.Test;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Vd1 {
public static void change(SinhVien sv){
  sv.settenSinhVien("Cuong");
}
/*
public static void change (SinhVien sv){
sv=new SinhVien("Cuong",2004,"Thanh hoa",1.74,64);
}*/
public static void main(String args[]) {
    //lop bao
SinhVien sv=new SinhVien("Hieu",2007,"Thanh Hoa",1.6,50);
Float fl=new Float("25.6");
float f=fl.floatValue();
int i=fl.intValue();
    System.out.println(f);
    System.out.println(i);
   int j = Integer.parseInt("123");//parse tra ve kieu nguyen thuy int
   int k=Integer.valueOf("123");//valueOf tra ve doi tuong Integer
    System.out.println(j);
    System.out.println(k);
   

    System.out.println(sv.gettenSinhVien());
    change(sv);
    System.out.println(sv.gettenSinhVien());
    System.out.println(sv.toString());
    
}
}
