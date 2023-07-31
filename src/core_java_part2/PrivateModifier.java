package core_java_part2;

public class PrivateModifier {

    //declear a variable
    private String text=" Hello World";
    private void display(){
        System.out.println(text);
    }
    public static void main(String[] args) {
        PrivateModifier privateModifier=new PrivateModifier();
        privateModifier.display();



    }
}
