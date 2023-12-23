package core_java_part3.JavaOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        //declare variable
        int firstNumber=300;
        int secondNumber=200;

        //&& Operator
        System.out.println((firstNumber>secondNumber)&&(firstNumber>secondNumber));
        System.out.println((firstNumber<secondNumber) &&(firstNumber<secondNumber));

        //|| operator
        System.out.println((firstNumber<secondNumber)||(firstNumber<secondNumber));
        System.out.println((firstNumber==secondNumber)||(firstNumber!=secondNumber));

        //! operator
        System.out.println(!(firstNumber==secondNumber));
        System.out.println(!(firstNumber>secondNumber));


    }
}
