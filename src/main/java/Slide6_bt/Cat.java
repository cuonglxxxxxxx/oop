/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;

/**
 *
 * @author Lenovo
 */
public class Cat extends Animal{
 public static void eat(){
     System.out.println("Don't eat...");
 }
 public void meow(){
     System.out.println("Meowing...");
 }
    public static void main(String[] args) {
       Cat cat=new Cat();
       Animal a1=cat;
       Animal a2=(Animal)cat;
       Cat cat1=(Cat)a1;
       cat.eat();
       cat.meow();
       a2.eat();
       a1.eat();
       cat1.eat();
    }
}
