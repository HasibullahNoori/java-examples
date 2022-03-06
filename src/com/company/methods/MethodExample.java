package com.company.methods;

import java.util.Scanner;

/*
method is set of instruction/code which can be re-used
method must have either return type or void but not both
 */
public class MethodExample {

    //since method return type is void so no return statement
    private void sellProduct(){
    }

    private void placeOrder(){

    }
//void method cannot return any date
    //it has no return statement
    private void payment(){
        System.out.println("Payment done");
    }
    //here return type is int so method should return any int value
    //return type and return statement should always be same

    /*
    method to calucale sum of threee marks entered
     */
    private int calculateTotalMark(int math, int english, int science){
        int sum = math + english + science;
        return sum;
    }

    public static void main(String[] args) {
        MethodExample example = new MethodExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of math english and science");
        int math = sc.nextInt();
        int english = sc.nextInt();
        int science = sc.nextInt();
        int totalMark = example.calculateTotalMark(math, english, science);
        System.out.println("Total marks obtained "+ totalMark);
        int perc = totalMark / 3;
        System.out.println("Scored percentage "+ perc);
    }
}
