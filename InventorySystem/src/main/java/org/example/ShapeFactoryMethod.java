package org.example;

public abstract class ShapeFactoryMethod {

    protected ColorBridge color;

    public ShapeFactoryMethod(ColorBridge color) {
        this.color = color;
    }

    protected ShapeFactoryMethod() {
    }

    public abstract void draw();
     abstract public void fillColor();
}
