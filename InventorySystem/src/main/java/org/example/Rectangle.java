package org.example;

public class Rectangle extends ShapeFactoryMethod {

    public double height;
    public double length;

    public Rectangle() {
    }

    public Rectangle(ColorBridge color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
        //color.fillColor();
    }

    @Override
    public void fillColor(){
        System.out.println("Filling rectangle");    }
}

