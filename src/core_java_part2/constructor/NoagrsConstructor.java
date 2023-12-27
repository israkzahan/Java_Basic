package core_java_part2.constructor;

public class NoagrsConstructor {
    String name;
    int phoneNumber;
    double age;
    boolean condition;

    //no-args constructor
    NoagrsConstructor(){
        String name="Israk Zahan";
        int phoneNumber= 0175344355;
        double age= 25;
        System.out.println(name);
        System.out.println(phoneNumber);
        System.out.println(age);
    }

    public static void main(String[] args) {
        NoagrsConstructor noagrsConstructor= new NoagrsConstructor();
    }
}
