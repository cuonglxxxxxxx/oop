/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;

/**
 *
 * @author Lenovo
 */
public class Test {
private double soDu;

    public double getSoDu() {
        return soDu;
    }

public Test(double soDu){
this.soDu=soDu;
}

public void  rutTien(double soTien)throws SoDuKhongDuException,Exception{
if(soTien>soDu){
throw new SoDuKhongDuException(new NullPointerException());
}
soDu-=soTien;
}
    public static void main(String[] args) {
        Test taikhoan=new Test(5000);
        try {
        taikhoan.rutTien(6000);
            System.out.println("Rut tien thanh cong.");    
        }catch(SoDuKhongDuException sdkd){
            System.out.println(sdkd.getCause());
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        System.out.println("Tai khoan con "+taikhoan.getSoDu());
    }
}
