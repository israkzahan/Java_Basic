package core_java_part2;

public class Constructor {
    String FirstName="John";

    //no-args constructor
    public Constructor(){
        int number =100;

        System.out.println(FirstName);
        System.out.println(number);
    }
    //parameterized constructor
    public Constructor(String name,int age){
        System.out.println("Name "+ name);
        System.out.println("age "+ age);
    }
    public static void main(String[] args) {
        Constructor constructor=new Constructor();
        Constructor constructor1= new Constructor("Israk", 100);

    }
}
