package com.company.view;

import java.io.FileWriter;
import java.io.IOException;

public class ResultFileWriter implements OutputWriter {
    private String fileName;

    public ResultFileWriter(String fileName) {
        this.fileName = fileName;
    }

    public void write(String outputResult) throws IOException {
        FileWriter myWriter = new FileWriter(fileName);
        myWriter.write(outputResult);
        myWriter.close();
    }
}
