package java_Practice;

public class Constructor {
    // declear a variable
    String FirstName = "John";

    //no-args constructor
   public Constructor(){ //public is the access modifier
       int number=100;
       System.out.println(number);
       System.out.println(FirstName);
   }
   //Parameterized Construstor
    public Constructor(String name, int age){
      System.out.println("Name " + name);
      System.out.println("Age " + age);
   }

    public static void main(String[] args) {
       //Create an object
       Constructor constructor=new Constructor();

       System.out.println("Output for parameterized constructor : ");

       Constructor constructor1=new Constructor("Israk", 50);

    }

}