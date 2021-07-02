package com.company.models;

public class Calculator {
    public Double calculate(Double numberOne, Double numberTwo, String inputOperand) {
        Double result = switch (inputOperand) {
            case "+" -> numberOne + numberTwo;
            case "*" -> numberOne * numberTwo;
            default -> (double) -1;
        };
        return result;
    }
}
