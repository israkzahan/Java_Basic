package Java_core_part1;

public class ObjectExample {
    //declear two variables
    String name;
    int age;
    //declear a constructor
    public ObjectExample(String name, int age){
        this.name=name;
        this.age=age;
    }
    public  void display(){
        System.out.println("Hello, my name is:"+name+" and my age is : "+age);
    }
    public static void main(String[] args){
        ObjectExample objectExample=new ObjectExample("Jhon", 26);
        objectExample.display();

    }


}
