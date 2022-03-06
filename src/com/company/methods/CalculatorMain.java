package com.company.methods;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter two value to subtract");
        int x = sc.nextInt();
        int y= sc.nextInt();
        int sum = calculator.add(x,y);
        int dif=calculator.subtract(x, y);
        int multiply=calculator.multiply(x,y);
        System.out.println("Sum of  of two number " +x +" "+y  +" is "+ sum);
        System.out.println("Difreence of two number " +x +" "+y  +" is "+ dif);
        System.out.println("Multiplication of  of two number " +x +" "+y  +" is "+ multiply);

    }

}
