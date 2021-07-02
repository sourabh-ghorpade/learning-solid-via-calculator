package com.company.view;

import java.io.IOException;

public class CSVWriter implements OutputWriter{
    @Override
    public void write(String outputResult) throws IOException {
        System.out.println(outputResult + "as a csv");
    }
}
