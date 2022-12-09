package org.example;

public class Circle extends ShapeFactoryMethod {
    private double radius;

    public Circle() {
    }

//    public Circle(ColorBridge color) {
//        super(color);
//    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public void fillColor(){
        System.out.println("filing circle");
        color.fillColor();}
}
