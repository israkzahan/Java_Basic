package core_java_part2;

public class ProtectedModifier_Example {
    protected String text = " Israk Zahan";
    protected  void dispaly(){
        System.out.println(text);
    }

    public static void main(String[] args) {
        //create an object
        ProtectedModifier_Example protectedModifierExample = new ProtectedModifier_Example();
        protectedModifierExample.dispaly();

        //getter setter example
        GetterSetter_Example getterSetterExample=new GetterSetter_Example();
        getterSetterExample.setName("Bangladesh is a beautiful country");
        System.out.println(getterSetterExample.getName());
    }
}
