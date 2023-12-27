package core_java_part2.constructor;

public class DefaultConstructor {

    //Without giving any value,which value is printed that is called default constructor
    String name;
    int phoneNumber;
    double age;
    boolean condition;

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor= new DefaultConstructor();
        System.out.println(defaultConstructor.name);
        System.out.println(defaultConstructor.phoneNumber);
        System.out.println(defaultConstructor.age);

    }
}
