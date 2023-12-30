package core_java_part3.JavaOperators;

public class AssignmentOperators {
    public static void main(String[] args) {
        //declare the variable
        int firstNumber=100;
        int number;
        //assign the value using = operator
        number= firstNumber;
        System.out.println("Numbers value is: " + number);
        //assign value using +=
        number+= firstNumber; //number=numner+firstnumber
        System.out.println("The value of the number is : " +number);

        //assign value using *=
        number*= firstNumber; //number=numner*firstnumber
        System.out.println("The value of the number is : " +number);
    }
}

