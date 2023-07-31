package core_java_part3.javaString;

public class StringImmutability {
    public static void main(String[] args) {
        //declare the variable
        String text1="Hello";
        String text2= text1;
        System.out.println("The value of the text is: " +text1);
        System.out.println("The value of the text2 is: " +text2);

        //add "world" with + operator
        text1= text1 + " World";

        System.out.println("After Modification: ");

        System.out.println("The value of the text is: " +text1);
        System.out.println("The value of the text2 is: " +text2);



    }
}
