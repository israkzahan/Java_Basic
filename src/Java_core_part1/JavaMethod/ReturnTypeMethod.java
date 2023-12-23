package Java_core_part1.JavaMethod;

public class ReturnTypeMethod {
    int firstNumber=300;
    int secondNumber=200;
    int addNumbers(){
        return firstNumber+secondNumber;
    }
    int divisionTwoNumber(){
        return firstNumber-secondNumber;
    }

    public static void main(String[] args) {
        ReturnTypeMethod returnTypeMethod= new ReturnTypeMethod();
        System.out.println(returnTypeMethod.addNumbers());
        System.out.println(returnTypeMethod.divisionTwoNumber());
    }

}
