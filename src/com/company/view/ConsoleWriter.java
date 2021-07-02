package com.company.view;

public class ConsoleWriter implements OutputWriter {
    public void write(String outputResult) {
        System.out.println(outputResult);
    }
}
