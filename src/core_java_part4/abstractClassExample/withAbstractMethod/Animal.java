package core_java_part4.abstractClassExample.withAbstractMethod;

public abstract class Animal {
    //declare abstract method
    abstract void bodyColor();

    //declare non-abstract method
    public void eat(){
        System.out.println("I can eat");
    }

}
