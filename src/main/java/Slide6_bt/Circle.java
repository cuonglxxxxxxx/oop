/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;

/**
 *
 * @author Lenovo
 */
public class Circle extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius){
    super("Unknow",false);
    this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle() {
        super("Unknow", false);
        this.radius =0;
    }

    @Override
    public double getArea() {
    return this.radius*this.radius*3.14;
    }

    @Override
    public double getPerimeter() {
    return this.radius*2*3.14;
    }

    @Override
    public String toString() {
    return color+""+filled+""+radius;
    }
    
}
