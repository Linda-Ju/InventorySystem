package org.example;


public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        //Factory
        System.out.println("FactoryMethod");
        ShapeFactoryMethod shapeC = factory.createShape("CIRCLE");
        shapeC.draw();
        ShapeFactoryMethod shapeR = factory.createShape("RECTANGLE");
        shapeR.draw();

        //Bridge
        System.out.println("Bridge");
        ShapeFactoryMethod shapeT = factory.createShape("TRIANGLE");
        shapeT.fillColor();

        //Adapter
        System.out.println("Adapter");
        DottedFillingAdaptee dottedCircle = new DottedFillingAdaptee();
        dottedCircle.fillWithDots();

        //Command
        System.out.println("Command");
        CalculatorCommand calculator = new CalculatorCommand();
        Command calculateArea = new CalculateCommand(calculator);

        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(calculateArea);
        invoker.executeCommands();

        //Iterator
        System.out.println("Iterator");
        ShapeStorageArray storageArray = new ShapeStorageArray();
        storageArray.addShape("Cone");
        storageArray.addShape("Sphere");
        storageArray.addShape("Cube");
        storageArray.addShape("Cylinder");
        storageArray.addShape("Pyramid");

        ShapeIterator iterator = new ShapeIterator(storageArray.getShapes());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Apply removing while iterating...");
        iterator = new ShapeIterator(storageArray.getShapes());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

    }

}