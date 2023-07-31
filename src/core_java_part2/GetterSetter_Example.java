package core_java_part2;

public class GetterSetter_Example {
    private  String name;
    //declear getter method
    public String getName(){
        return this.name;
    }
    //declear setter method
    public void setName(String name){
        this.name=name;

    }

    public static void main(String[] args) {
        GetterSetter_Example getterSetterExample=new GetterSetter_Example();
        getterSetterExample.setName("Hi, This is for practise");
        System.out.println(getterSetterExample.getName());

    }
}
