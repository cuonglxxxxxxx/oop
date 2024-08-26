/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;

/**
 *
 * @author Lenovo
 */
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length) {
        super("Unknow", false);
        this.width = width;
        this.length = length;
    }
    public Rectangle() {
        super("Unknow", false);
        this.width =0;
        this.length =0;
    }        

    @Override
    public double getArea() {
    return width*length;
    }
    @Override
    public double getPerimeter() {
    return (width+length)*2;
    }

    @Override
    public String toString() {
    return color+""+filled+""+width+length;
    }
    
}
