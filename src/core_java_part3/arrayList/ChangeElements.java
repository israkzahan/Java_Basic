package core_java_part3.arrayList;

import java.util.ArrayList;

public class ChangeElements {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        //adding the value
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(500);
        //print the values of the array List
        System.out.println("The Integer number is: " + number);
        //updating the value by the index number and the updated value
        number.set(1,50000);
        //print the value after updating
        System.out.println("After updating the value : " +number);
    }
}
