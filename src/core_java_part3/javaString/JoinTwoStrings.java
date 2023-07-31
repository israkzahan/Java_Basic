package core_java_part3.javaString;

public class JoinTwoStrings {
    public static void main(String[] args) {
        //declare 1st variables

        String text1=" Java ";

        System.out.println("First text: " +text1);

        //declare 2nd variables

        String text2="is a most popular programming language";
        System.out.println("Second Text: " +text2);


        String joinString= text1.concat(text2);
        System.out.println("Joined String: " + joinString);




    }
}
