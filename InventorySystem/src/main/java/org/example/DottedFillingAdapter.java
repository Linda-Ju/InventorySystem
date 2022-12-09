package org.example;

public class DottedFillingAdapter implements ColorBridge{

    DottedFillingAdaptee dottedCircle;

    public DottedFillingAdapter(DottedFillingAdaptee newDottedCircle) {
        dottedCircle = newDottedCircle;
    }

    @Override
    public void fillColor() {
        dottedCircle.fillWithDots();
    }
}
