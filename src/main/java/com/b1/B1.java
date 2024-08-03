/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.b1;

/**
 *
 * @author Lenovo
 */
public class B1 {
    public static void main(String[] args) {
        Vector vt1=new Vector();
        Vector vt2=new Vector();
        vt1.nhapThongTin(1, 2, 3);
        vt2.nhapThongTin(3, 2, 1);
        vt1.inThongTin();
        vt2.inThongTin();
        vt1.nhanHangSo(2);
        vt1.tichVoHuong(vt2);
        vt1.congVector(vt2);
    }
    
}
