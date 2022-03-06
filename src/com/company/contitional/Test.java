package com.company.contitional;

import java.util.Scanner;

//most used conditional statement is if , if-else, if-elseif-else
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Entered  age is " + age);
       /*
       operator to check condition
        >
        <
        =
        */

        if(age > 18 && age <= 20){
            //statements
            //business logic
            buyCigrate(sc);

        }else if(age >=20){
            buyCigrate(sc);
            buyLiquor(sc);
        }
        else {
            System.out.println("you dont have permission to buy liquor or cigrate for your age "+ age);
        }


    }

    public static void buyLiquor(Scanner scanner){
        System.out.println("How many liquor bottle you want ");
        int noOfBottle = scanner.nextInt();
        System.out.println("You have successfully brought "+noOfBottle +" bottle of liquor ");
    }

    public static void buyCigrate(Scanner scanner){
        System.out.println("How many cigrate you want");
        int no = scanner.nextInt();
        System.out.println("You have brought " + no + " cigrate");
    }
}
