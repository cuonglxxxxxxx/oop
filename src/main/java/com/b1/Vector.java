/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.b1;

/**
 *
 * @author Lenovo
 */
public class Vector {
    private double tungDo;
    private double hoanhDo;
    private double caoDo;

    public double getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public double getCaoDo() {
        return caoDo;
    }

    public void setCaoDo(double caoDo) {
        this.caoDo = caoDo;
    }

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }
    
    public void congVector(Vector b){
     Vector vt=new Vector();
     vt.tungDo=this.tungDo+b.tungDo;
     vt.hoanhDo=this.hoanhDo+b.hoanhDo;
     vt.caoDo=this.caoDo+b.caoDo;
        System.out.println("x= "+ vt.hoanhDo);
        System.out.println("y= "+vt.tungDo);
        System.out.println("z= "+vt.caoDo);

    }
        public void truVector(Vector b){
     Vector vt=new Vector();
     vt.tungDo=this.tungDo-b.tungDo;
     vt.hoanhDo=this.hoanhDo-b.hoanhDo;
     vt.caoDo=this.caoDo-b.caoDo;
        System.out.println("x= "+ vt.hoanhDo);
        System.out.println("y= "+vt.tungDo);
        System.out.println("z= "+vt.caoDo);

    }
    public void nhanHangSo(double b){
     Vector vt=new Vector();
     vt.tungDo=this.tungDo*b;
     vt.hoanhDo=this.hoanhDo*b;
     vt.caoDo=this.caoDo*b;
        System.out.println("x= "+ vt.hoanhDo);
        System.out.println("y= "+vt.tungDo);
        System.out.println("z= "+vt.caoDo);

    }
    public void tichVoHuong(Vector b){
     Vector vt=new Vector();
     vt.tungDo=this.tungDo*b.tungDo;
     vt.hoanhDo=this.hoanhDo*b.hoanhDo;
     vt.caoDo=this.caoDo*b.caoDo;
        System.out.println("Tich vo huong cua 2 vecto la: "+ (vt.hoanhDo+vt.tungDo+vt.caoDo));
    } 
    public void inThongTin(){
        System.out.println("x= "+this.hoanhDo);
        System.out.println("y= "+this.tungDo);
        System.out.println("z= "+this.caoDo);
    }
    public void nhapThongTin(double a,double b,double c){
     this.setHoanhDo(a);
     this.setTungDo(b);
     this.setCaoDo(c);
    }
}
