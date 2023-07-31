package core_java_part3.javaString;

public class CompareTwoStrings {
    public static void main(String[] args) {
        //DECLARE THE VARIABLES
        String first_text="Java Language";
        String second_text= "Java Language";
        String third_text = " Phython Language";

        //compare between first_text and second_text

        boolean result1= first_text.equals(second_text);
        System.out.println("First text and second text are equal: " +result1);

       //compare between third_text and second_text
        boolean result2= third_text.equals(second_text);
        System.out.println("First text and second text are equal: " +result2);


    }
}
