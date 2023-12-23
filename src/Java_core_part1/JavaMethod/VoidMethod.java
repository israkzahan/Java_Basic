package Java_core_part1.JavaMethod;

public class VoidMethod {
    String firstName="Israk";
    String middleName="Zahan";
    int phoneNumber= 1753443558;
    void printTheValues(){
        System.out.println("My FirstName"+firstName);
        System.out.println("My Middle Name"+middleName);
        System.out.println("My phoneNumber"+ phoneNumber);
    }

    public static void main(String[] args) {
        VoidMethod voidMethod= new VoidMethod();
        voidMethod.printTheValues();

        System.out.println("**********Print second time******************");
        voidMethod.printTheValues();
    }
}
