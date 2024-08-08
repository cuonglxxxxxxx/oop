
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
int j = Integer.parseInt("123");//parse tra ve kieu nguyen thuy int
int k=Integer.valueOf("123");//valueOf tra ve doi tuong Integer
int m=new Integer(Integer.MAX_VALUE);
//System.out.println(m);
System.out.println(Integer.MAX_VALUE);
String input = "test 1-2-3";
int output = 0;
for (int index=0;index<input.length();index++) {
char c = input.charAt(index);
if (Character.isDigit(c))
output = output * 10 + Character.digit(c, 10);// Character.digit(c, 10) chuyen ki tu c sang he thap phan (he 10)
}
System.out.println(output);
    System.out.println("tong: "+1+2+3);
    System.out.println("tong: "+(1+2+3));
    System.out.println("Qua "+"dat "+"nay "+"la "+"cua "+"bo "+"may ");
String name="DSK DE SUN KID";
        System.out.println(name.charAt(4));
   StringBuffer buffer=new StringBuffer(15);
   buffer.append("DE ");
   buffer.append("KID ");
   buffer.insert(4, "SUN ");
    System.out.println(buffer);
}
}
