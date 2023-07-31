package core_java_part2.inheritanceDemo;

public class Dog extends Animal{
    String text ="Hello, This text from dog class";
    public void display(){
        System.out.println(text);
    }
    public void displayName(){
        System.out.println("The dog name is: " +name);
    }

}
