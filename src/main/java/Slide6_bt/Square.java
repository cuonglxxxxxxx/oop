/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;

/**
 *
 * @author Lenovo
 */
public class Square extends Rectangle {
    
    public Square() {
    }
    public Square(double side,String color,boolean filled) {
        super(side,side,color,filled);
    }
    public Square(double side) {
        super(side,side);
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String toString(){
    return color+""+filled+""+width;
    }
    
}
