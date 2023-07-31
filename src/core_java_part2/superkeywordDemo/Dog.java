package core_java_part2.superkeywordDemo;

public class Dog extends Animal {
    @Override
    public void cow(){
        super.cow();
        System.out.println("I am from dog class");
    }
}
