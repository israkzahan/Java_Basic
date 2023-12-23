package java_part3.javaOperators;

public class AssignmentOperators {
    public static void main(String[] args) {
         int number_one= 20;
         int number_two;
         number_two = number_one;
         System.out.println(number_two);

         //assign value using +=
        number_two+= number_one; // number_two= number_two+number_one
        System.out.println(" The value of the number is : " +number_two );
        // assign value using *=

        number_two*= number_one; // number_two= number_two * number_one
        System.out.println(" The value of the number is : " +number_two );


    }
}
