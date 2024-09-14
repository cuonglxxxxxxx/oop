/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.io.FileReader;
/**
 *
 * @author Lenovo
 */
public class TestBox {
    /*
    public static void docFile(String tenFile){
        try {
            FileReader reader=new FileReader(tenFile);    
        } catch (Exception e) {
            System.out.println("file khong ton tai");
        }
  
    }
*/
    public static void docFile(String tenFile)throws FileNotFoundException{
            FileReader reader=new FileReader(tenFile);    
    }
    public static void doDaiString(String s)throws NullPointerException{
        
        if(s==null){
        throw new NullPointerException("Chuoi ko dc null nhe ni");
        }
        System.out.println("Do dai chuoi la: "+s.length());
        
    }
    public static void main(String[] args)throws FileNotFoundException {
        String ten=null;
        docFile("patric.txt");
        doDaiString(ten);
}
}