package core_java_part3.arrayDemo;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        //adding the value
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Bentley");
        cars.add("Forari");
        //print the values of the array List
        System.out.println("The Cars Bbrands name are: " + cars);
        //updating the value by the index number and the updated value
        cars.remove(2);
        //print the value after removing
        System.out.println("After removing the name : " +cars);
        cars.add("Ford");
        System.out.println("After adding the value again: " + cars);

    }
}
