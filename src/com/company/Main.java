package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    Double numberOne = 2.0, numberTwo = 2.0;
	    String inputOperand = "+";
        Double result = (double) -1;
        switch (inputOperand) {
            case "+" : result = numberOne + numberTwo;
            break;
            case "*": result = numberOne * numberTwo;
            break;
        }
	    String outputResult = "result = " + result;
        outputToConsole(outputResult);
        outputToFile(outputResult);
    }

    private static void outputToFile(String outputResult) throws IOException {
        FileWriter myWriter = new FileWriter("output.txt");
        myWriter.write(outputResult);
        myWriter.close();
    }

    private static void outputToConsole(String outputResult) {
        System.out.println(outputResult);
    }
}
