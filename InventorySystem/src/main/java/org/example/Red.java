package org.example;

public class Red implements ColorBridge {
    @Override
    public void fillColor() {
        System.out.println("Filling in red color");
    }
}
