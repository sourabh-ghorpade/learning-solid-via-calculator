package com.company.controller;

import com.company.models.Calculator;
import com.company.view.OutputWriter;

import java.io.IOException;
import java.util.List;

public class Controller {
    private OutputWriter writer;

    public Controller(OutputWriter writer) {
        this.writer = writer;
    }

    public void run() throws IOException {
        Double numberOne = 2.0, numberTwo = 2.0;
        String inputOperand = "+";
        Double result = new Calculator().calculate(numberOne, numberTwo, inputOperand);
        String outputResult = "result = " + result;
        writer.write(outputResult);
    }
}
