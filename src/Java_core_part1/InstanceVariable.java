package Java_core_part1;

public class InstanceVariable {
    int number= 20;
    String instanceVariable= "This variable is instance variable";

    public static void main(String[] args) {
        InstanceVariable instanceVariable = new InstanceVariable();
        System.out.println(instanceVariable.number);
        System.out.println(instanceVariable.instanceVariable);
    }
}
