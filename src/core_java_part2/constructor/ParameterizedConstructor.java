package core_java_part2.constructor;

public class ParameterizedConstructor {
    ParameterizedConstructor(String name, String address,int phoneNumber){
        System.out.println("My name is: " +name);
        System.out.println("My address is: " +address);
        System.out.println("My phoneNumber is : " +phoneNumber);

    }

    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor= new ParameterizedConstructor("Israk Zahan","Dhaka",123456789);
        ParameterizedConstructor parameterizedConstructor1= new ParameterizedConstructor("Monisha","Dhaka2",01234567);
    }
}
