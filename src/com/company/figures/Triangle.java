package com.company.figures;



    public class Triangle extends Figure{
        public Triangle(Color color, char symbol) {
            super(color, symbol);
        }

        public void calculateArea(double width, double height) {
            double triangleSquare = (width * height) / 2;
            System.out.println("The Square is: " + triangleSquare);
        }

    }

