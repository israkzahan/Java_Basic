package Java_core_part1.JavaMethod;

public class ParameterizedMethod {
    //void type parameterized method
    static void printBioData(String name, String address,int age, int phone){
        System.out.println("First name is: "+name);
        System.out.println("My address: "+ address);
        System.out.println("Age is: "+ age);
        int Phone= phone;
        System.out.println(+phone);
    }
    //parameterized method using return type method
    int addValue(int num1,int num2){
       return num1+num2;
    }

    public static void main(String[] args) {
        System.out.println("*********parameterized method using void type method*********");
        printBioData("Israk","Dhaka",25,123456);
        printBioData("Moushi","Dhaka",20,123456);

        ParameterizedMethod parameterizedMethod= new ParameterizedMethod();
        System.out.println("*********parameterized method using return type method*********");
        System.out.println(parameterizedMethod.addValue(500,300));
        System.out.println(parameterizedMethod.addValue(800,300));
        //s
    }
}
