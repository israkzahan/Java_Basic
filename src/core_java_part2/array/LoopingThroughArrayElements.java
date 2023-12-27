package core_java_part2.array;

public class LoopingThroughArrayElements {
    public static void main(String[] args) {
        String [] fruits={"Mango","Orange","Apple","Fruit"};
        System.out.println(+fruits.length);
        //print value using loop
        for(int i=0;i<fruits.length;i++){
            System.out.println("The fruits are: "+fruits[i]);
        }
    }

}
