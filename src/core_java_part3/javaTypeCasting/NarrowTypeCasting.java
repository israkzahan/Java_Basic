package core_java_part3.javaTypeCasting;

public class NarrowTypeCasting {
    public static void main(String[] args) {
        //declare a variable
        double number= 150;
        System.out.println("Before converting: " + number);

        int ConvertNumber=(int) number;
        System.out.println("After converting the value is : " +ConvertNumber);
    }
}
