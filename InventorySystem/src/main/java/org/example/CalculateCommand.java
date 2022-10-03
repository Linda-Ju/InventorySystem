package org.example;

public class CalculateCommand implements Command {

    CalculatorCommand calculator;

    public CalculateCommand(CalculatorCommand calculator){
        this.calculator=calculator;
    }
    @Override
    public void execute() {
        calculator.calculateCircleArea(5);
        calculator.calculateRectangleArea(6,8);
    }
}