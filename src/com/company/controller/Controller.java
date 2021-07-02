package com.company.controller;

import com.company.models.Calculator;
import com.company.view.ConsoleWriter;
import com.company.view.ResultFileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    public void run() throws IOException {
        Double numberOne = 2.0, numberTwo = 2.0;
        String inputOperand = "+";
        Double result = new Calculator().calculate(numberOne, numberTwo, inputOperand);
        String outputResult = "result = " + result;
        new ConsoleWriter().write(outputResult);
        new ResultFileWriter("output.txt").write(outputResult);
    }
}
