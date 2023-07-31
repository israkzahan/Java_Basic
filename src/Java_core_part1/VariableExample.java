package Java_core_part1;

public class VariableExample { //class

    //Declare instance variable
    String instanceVariable="This is the instanceVariable";

    //Declear  a static/class variable
    static String staticVariable=" This is the static variable";

    public static void main(String[] args) { // main method

        //Declear  a static/class variable & print the value
        String localVariable="This is a LocalVariable";
        System.out.println(localVariable);

        //Create an Object & print the instanceVariable value

        VariableExample variableExample=new VariableExample();
        System.out.println(variableExample.instanceVariable);
        //print staticVariable value
        System.out.println(staticVariable);

    }


}
