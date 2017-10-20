package com.shapes;

import java.util.Scanner;

public class Square implements Shape {
    int width;
    public Square(){
        int shape ;
        Scanner in = new Scanner(System.in);
        System.out.print("input length of shape:");
        shape = in.nextInt();
        this.width = shape;
    }
    @Override
    public double calculateArea() {
        return width*width;
    }

    @Override
    public double calculatePerimeter() {
        return width*4;
    }
}
