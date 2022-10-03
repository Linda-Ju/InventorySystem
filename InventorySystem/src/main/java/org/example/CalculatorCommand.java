package org.example;

import static java.awt.Color.black;

public class CalculatorCommand{
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();

    public void calculateCircleArea(double radius){
        double area = 3.14 * radius;
        System.out.println(area);
    }

    public void calculateRectangleArea(double length, double height){
        double area = length * height;
        System.out.println(area);

    }
}
