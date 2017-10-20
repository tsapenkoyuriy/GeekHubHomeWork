package com.shapes;

import java.util.Scanner;

public class Triangle implements Shape{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(){
        Scanner in = new Scanner(System.in);
        int sideA,sideB,sideC;
        System.out.print("Input length of side A:");
        sideA = in.nextInt();
        System.out.print("Input length of side B:");
        sideB = in.nextInt();
        System.out.print("Input length of side C:");
        sideC = in.nextInt();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double calculateArea() {
        double p = this.calculatePerimeter()/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
}
