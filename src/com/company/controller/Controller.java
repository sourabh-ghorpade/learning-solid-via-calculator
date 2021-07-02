package com.company.controller;

import com.company.models.Calculator;

import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    public void run() throws IOException {
        Double numberOne = 2.0, numberTwo = 2.0;
        String inputOperand = "+";
        Double result = new Calculator().calculate(numberOne, numberTwo, inputOperand);
        String outputResult = "result = " + result;
        outputToConsole(outputResult);
        outputToFile(outputResult);
    }

    private void outputToFile(String outputResult) throws IOException {
        FileWriter myWriter = new FileWriter("output.txt");
        myWriter.write(outputResult);
        myWriter.close();
    }

    private void outputToConsole(String outputResult) {
        System.out.println(outputResult);
    }
}
