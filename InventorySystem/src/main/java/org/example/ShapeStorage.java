package org.example;

public class ShapeStorage {

    private ThreeDimensionalShapes []shapes = new ThreeDimensionalShapes[5];
    private int index;

    public void addShape(String name){
        int i = index++;
        shapes[i] = new ThreeDimensionalShapes(i,name);
    }

    public ThreeDimensionalShapes[] getShapes(){
        return shapes;
    }
}
