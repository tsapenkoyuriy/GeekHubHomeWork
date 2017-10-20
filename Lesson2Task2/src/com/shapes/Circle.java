package com.shapes;

import java.util.Scanner;

public class Circle implements Shape{
    private int radius;
    public Circle(){
        Scanner in = new Scanner(System.in);
        int radius;
        System.out.println("Input radius:");
        radius = in.nextInt();
        this.radius = radius;
    }

    public double calculateArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius*2*Math.PI;
    }
}
