package core_java_part3.arrayList;

import java.util.ArrayList;

public class AddElementsArrayList {
    public static void main(String[] args) {
        ArrayList<String> languages= new ArrayList<>();
        //add elements to arrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        System.out.println("Print all the language: "+languages);

        languages.add("C++");
        languages.add("C");
        System.out.println("After adding the new value: "+languages);

        //access the elements
        System.out.println("Access the elements: "+languages.get(2));
        //update the element
        languages.set(3,"Dot Net");
        System.out.println("After update the value: "+languages);
        //remove the value
        languages.remove(4);
        System.out.println("After removing the value: "+languages);
    }
}
