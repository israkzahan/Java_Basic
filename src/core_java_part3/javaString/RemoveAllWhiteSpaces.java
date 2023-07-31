package core_java_part3.javaString;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        //declare Variable
        String text1="Learn     Java   Language. " ;
        System.out.println(text1);
        System.out.println("Print the text afer removing all the white space");

        String result = text1.replaceAll("\\s", "");
        System.out.println(result);
    }
}
