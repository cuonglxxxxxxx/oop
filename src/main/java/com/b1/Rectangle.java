/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.b1;

/**
 *
 * @author Lenovo
 */
public class Rectangle {
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public void inThongTin(){
        System.out.println("Chieu dai cua hcn la: "+this.chieuDai);
        System.out.println("Chieu rong cua hcn la:" +this.chieuRong);
    }
}
