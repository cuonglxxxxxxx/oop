/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quanly;
import java.util.Scanner;
import com.quanly.HinhVuong;
/**
 *
 * @author Lenovo
 */
public class Diem {
 private int x,y;
 public Diem(){};
 public Diem(int x,int y){
 this.x=x;
 this.y=y;
 }
 
 public void setX(int x){this.x=x;}
 public int getX(){return this.x;} 
 public void inDiem(){
     System.out.println("("+x+","+y+")");
 }
}
