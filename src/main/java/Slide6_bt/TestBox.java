/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;

/**
 *
 * @author Lenovo
 */
public class TestBox {
    public static void main(String[] args) {
        Box box=new Box<Integer>(15);
        System.out.println("Gia tri:"+box.getValue());
        Box box1=new Box<String>("Hello");
        System.out.println("Gia tri"+box1.getValue());
        
    }
}
