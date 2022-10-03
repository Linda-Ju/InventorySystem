package org.example;


public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        //Factory
        ShapeFactoryMethod shapeC = factory.createShape("CIRCLE");
        shapeC.draw();
        ShapeFactoryMethod shapeR = factory.createShape("RECTANGLE");
        shapeR.draw();

        //Bridge
        ShapeFactoryMethod shapeT = factory.createShape("TRIANGLE");
        shapeT.fillColor();

        //Command
        CalculatorCommand calculator = new CalculatorCommand();
        Command calculateArea = new CalculateCommand(calculator);

        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(calculateArea);
        invoker.executeCommands();

        //Iterator
        ShapeStorage storage = new ShapeStorage();
        storage.addShape("Cone");
        storage.addShape("Sphere");
        storage.addShape("Cube");
        storage.addShape("Cylinder");
        storage.addShape("Pyramid");

        ShapeIterator iterator = new ShapeIterator(storage.getShapes());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Apply removing while iterating...");
        iterator = new ShapeIterator(storage.getShapes());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }

}