package core_java_part3.arrayList;

import java.util.ArrayList;

public class AddingElements {
   //declare the main method
    public static void main(String[] args) {
    /*     int [] numbers={100,200,300,452,325};
        for(int number:numbers){
            System.out.println(number);
        }
        System.out.println("After replaceing the value: ");
        int[] numbers_two={100,200,300,400,500};
        for(int number2:numbers_two){
            System.out.println(number2);
        }
    }*/
        //declare an arrayList
        ArrayList<String> programmingLanguage = new ArrayList<>();
        //adding value
        programmingLanguage.add("C");
        programmingLanguage.add("Python");
        programmingLanguage.add("Java");
        programmingLanguage.add("C#");
        programmingLanguage.add("C++");
        System.out.println("The values of the number: "+programmingLanguage);

    }

}
