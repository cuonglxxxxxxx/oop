/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;

/**
 *
 * @author Lenovo
 */
public class Infor<T extends Animal> {
    private T name;
    public Infor(T name){
    this.name=name;
    }
    public T getName(){
    return this.name;
    }
    public static void main(String[] args) {
        Infor<Cat> catinfor=new Infor<Cat>(new Cat());
    }
    
}
