package core_java_part3.javaString;

public class RemoveNumberFormText {
    public static void main(String[] args) {
        String text="Java1122is2587fun223364";
        // \\d+ = It means ,it get all the digits
        String regex="\\d+";
        System.out.println("Before replacing the variable");
        System.out.println(text);
        System.out.println("After replacing the all the numbers: ");
        System.out.println(text.replaceAll(regex," "));

    }
}
