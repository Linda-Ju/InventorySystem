package org.example;

public class Triangle extends ShapeFactoryMethod{

    public Triangle(ColorBridge color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
        color.fillColor();
    }

    @Override
    public void fillColor() {
        System.out.print("filling triangle with");
        color.fillColor();
    }
}
