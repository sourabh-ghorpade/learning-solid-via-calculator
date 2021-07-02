package com.company;

import com.company.controller.Controller;
import com.company.view.CSVWriter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        new Controller(new CSVWriter()).run();
    }
}
