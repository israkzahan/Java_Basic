package java_part3.javaOperators;

public class LogicalOperator {

    public static void main(String[] args) {
        int number1=300;
        int number2=200;
        // && operators
         System.out.println((number1>number1) && (number1>number2));
         System.out.println((number1<number2) && (number1<number2));

         //  || operator
         System.out.println((number1<number2) || (number1<number2));

         //! operator
        System.out.println(!(number1==number2));
    }
}
