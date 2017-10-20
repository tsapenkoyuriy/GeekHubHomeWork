package com.shapes;
import java.util.Scanner;
public class Rectangle extends Square {
    private int height;

    public Rectangle(){
        Scanner in = new Scanner(System.in);
        int width, height;
        System.out.print("Input width:");
        width = in.nextInt();
        System.out.print("Input height:");
        height = in.nextInt();
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2*width+2*height;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }
}
