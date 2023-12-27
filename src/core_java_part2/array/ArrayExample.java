package core_java_part2.array;

public class ArrayExample {
    public static void main(String[] args) {
        //create an array
        String [] name ={"Jhon", "Harry","Leo", "Israk"};

         System.out.println("The first name: " + name[0]);
        System.out.println("The second name: " + name[1]);
        System.out.println("The third name: " + name[2]);
        System.out.println("The fourth name: " + name[3]);


        System.out.println("Print value using the for-each loop");
        for (String displayValues:name){
            System.out.println(displayValues);
        }
    }
}
