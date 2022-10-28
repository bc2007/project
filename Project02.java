package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        /*
        >>>--------------- TASK 1 ---------------<<<
         */

        System.out.println(">>>--------------- TASK 1 ---------------<<<");
        System.out.println("Please enter 3 numbers");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();
        int num3 = userInput.nextInt();
        System.out.println("The product of the numbers entered is = " + num1*num2*num3);


        /*
        >>>--------------- TASK 2 ---------------<<<
         */

        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        userInput.nextLine();
        System.out.println("What is your first name?");
        String fName = userInput.nextLine();
        System.out.println("What is your last name?");
        String lName = userInput.nextLine();
        System.out.println("What is your year of birth?");
        int birthYear = userInput.nextInt();
        System.out.println(fName +" " + lName + "'s age is = " + (2022-birthYear) + ".");


        /*
        >>>--------------- TASK 3 ---------------<<<
         */

        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        userInput.nextLine();
        System.out.println("What is your full name?");
        String fullName = userInput.nextLine();
        System.out.println("What is your weight?");
        double kgWeight = userInput.nextDouble();
        System.out.println(fullName + "’s weight is =" + kgWeight*2.205 + " lbs.");


        /*
        >>>--------------- TASK 4 ---------------<<<
         */

        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        userInput.nextLine();
        System.out.println("What is your full name?");
        String fullName1 = userInput.nextLine();
        System.out.println("What is your age?");
        int age1 = userInput.nextInt();
        userInput.nextLine();
        System.out.println("What is your full name?");
        String fullName2 = userInput.nextLine();
        System.out.println("What is your age?");
        int age2 = userInput.nextInt();
        userInput.nextLine();
        System.out.println("What is your full name?");
        String fullName3 = userInput.nextLine();
        System.out.println("What is your age?");
        int age3 = userInput.nextInt();
        System.out.println(fullName1 + "'s age is " + age1 + ".");
        System.out.println(fullName2 + "'s age is " + age2 + ".");
        System.out.println(fullName3 + "'s age is " + age3 + ".");
        System.out.println("The average age is " + (age1 + age2 + age3)/3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(age1, age2), age3) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(age1, age2), age3) + ".");
    }
}
