package com.company.figures;


public class Square extends Figure{
    public Square(Color color, char symbol) {
        super(color, symbol);
    }

    public void calculateArea(int side) {
        int Square = side * side;
        System.out.println("The Square of the Square is: " + Square);
    }
}