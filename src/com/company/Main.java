package com.company;

import com.company.controller.Controller;
import com.company.view.ConsoleWriter;
import com.company.view.OutputWriter;
import com.company.view.ResultFileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<OutputWriter> writers = new ArrayList<>();
        writers.add(new ConsoleWriter());
        writers.add(new ResultFileWriter("output.txt"));
        new Controller(writers).run();
    }
}
