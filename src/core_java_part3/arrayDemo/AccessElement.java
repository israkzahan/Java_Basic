package core_java_part3.arrayDemo;

import java.util.ArrayList;

public class AccessElement {
    public static void main(String[] args) {
        //Create an arrayList
        ArrayList<String> fruits=new ArrayList<>();
        //add the elements
        fruits.add(" Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        //print the values
        System.out.println("The fruits name is: " +fruits);

        //access the array value
        String accessValue= fruits.get(2);

        System.out.println("Elements at the index of 2 is : "+ accessValue);
        System.out.println("Elements at the index of 2 is : "+ accessValue);

    }
}
