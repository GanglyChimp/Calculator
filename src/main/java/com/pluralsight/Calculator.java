package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner userInput= new Scanner(System.in);
       //how can I add more than just 2 numbers without writing 20+ extra lines?
       System.out.print("eneter first number");
       double num1 = userInput.nextInt();
       System.out.print("enter second number");

       //what do we want to do with these 2 numbers?
        // how do I go about adding a call to a specific calculation
       double num2 = userInput.nextInt();

        // double also works but why?
        //user enters calculation function *,+,-,%

        System.out.println("\t*");
        System.out.println("\t -");
        System.out.println("\t +");
        System.out.println("\t /");

        System.out.print("select math function ");
        switch (userInput.nextLine()) {
            case "*":
                System.out.print("your answer is" + (num1 * num2));
            break;
            case "-":
                System.out.print("your answer is" + (num1 - num2));
            break;
            case "+":
                System.out.print ("your answer is" + (num1 + num2));
            break;
            case  "/":
                System.out.print("your answer is" +(num1 / num2));
            break;

        }
        System.out.print("press any key to continue");

    //the program should take the users input of a calculation and run the function
       //could do if statements to call upon a specific function
       //add new public class to create seperate function that calls to a specific calculation function?
        //int sum = num1 + num2;



       // System.out.println("the answer is " + sum);
    }
}//function is not letting me use "switch" function
