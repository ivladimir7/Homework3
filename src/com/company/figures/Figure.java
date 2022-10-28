package com.company.figures;


import java.io.File;
import java.io.PrintStream;

public class Figure {
    enum Color {Red, Green, Blue}
    char symbol;

    public static void main(String[] args) {

        System.out.println();

    }

    public Figure(Color color, char symbol) {
            this.symbol = symbol;
        }

         public void calculateArea () {
            System.out.println("The figure is not assigned");
        }

    }