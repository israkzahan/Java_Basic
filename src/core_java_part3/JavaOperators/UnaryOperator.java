package core_java_part3.JavaOperators;

public class UnaryOperator {
    public static void main(String[] args) {
        //declare variable
        int firstNumber=100, secondNumber=50;
        int result1,result2,result3;
        //increment operator
        result1= ++firstNumber; // 100+1
        System.out.println("After increment: " +result1);
        //decrement operator
        result2=--secondNumber;//50-1
        System.out.println("After decrement: " +result2);

        result3= secondNumber++; // 100+1
        System.out.println("After increment: " +result3);



    }
}
