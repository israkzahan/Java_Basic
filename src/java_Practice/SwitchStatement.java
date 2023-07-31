package java_Practice;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //declear variable
        char operator;
        Double num1,num2, result;
        //create an object for scanner class
        Scanner input = new Scanner (System.in);
        //ask the user to give the input
        System.out.println("Chose an operator : +, -, *,/");
        operator= input.next().charAt(0);
        //ask users to enter numbers
        System. out.println("Enter the first number");
        num1=input.nextDouble();
        System.out.println("Enter the second number");
        num2= input.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+ " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + "- " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + "* " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/ " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        input.close();;


    }

}
