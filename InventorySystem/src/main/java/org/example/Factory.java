package org.example;

import java.util.Random;

public class Factory {
    //private Random random = new Random();


    public ShapeFactoryMethod createShape(String shape) {

        if(shape == null){
            return null;
        }if(shape.equals("CIRCLE")){
            return new Circle();
        }else if(shape.equals("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equals("TRIANGLE")) {
            return new Triangle(new Black());
        }else{
            return null;
        }



//        ShapeFactoryMethod shape = null;
//        switch (type) {
//            case CIRCLE:
//                shape = new Circle();
//                break;
//            case RECTANGLE:
//                shape = new Rectangle();
//        }
//        return shape;
    }
}
