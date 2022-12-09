package org.example;

public abstract class ShapeFactoryMethod {

    protected ColorBridge color;

    public ShapeFactoryMethod(ColorBridge color) {
        this.color = color;
    }

    protected ShapeFactoryMethod() {
    }

    //factory method
    public abstract void draw();

    //Bridge
    public abstract void fillColor();


}
