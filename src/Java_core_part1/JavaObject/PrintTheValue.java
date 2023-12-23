package Java_core_part1.JavaObject;

import Java_core_part1.PrintValue;

public class PrintTheValue {

    String Text="This text is comming form PrintValues class";

    public static void main(String[] args) {
        VariableClass variableClass= new VariableClass();
        System.out.println(variableClass.name);
        System.out.println(variableClass.age);
        System.out.println(variableClass.address);

//This object is created for print the printTheValue class text

        PrintTheValue printTheValue= new PrintTheValue();
        System.out.println(printTheValue.Text);
    }

}
