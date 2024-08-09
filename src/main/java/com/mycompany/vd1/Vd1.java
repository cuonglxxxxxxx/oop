
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
public static int plus (int ... arr){
int kq=0;
for(int i:arr){
kq+=i;
}
return kq;
}
    public static void main(String[] args) {
        System.out.println(plus(1,2,3,4,5));
    }
}
