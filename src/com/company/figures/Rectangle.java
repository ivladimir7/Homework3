package com.company.figures;

import java.awt.*;

public class Rectangle extends Figure{
    public Rectangle(Color color, char symbol) {
        super(color, symbol);
    }

    public void calculateArea(double width, double height) {
        double rectangleSquare = width * height;
        System.out.println("The Square is: " + " "+  rectangleSquare);
    }

}

