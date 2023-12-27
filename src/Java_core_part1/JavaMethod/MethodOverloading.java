package Java_core_part1.JavaMethod;

public class MethodOverloading {
     static int add( int num1, int num2){

        int result=num1+num2;
        return result;

    }
    static int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    static double add(double num1, double num2,double num3){
        double addResult= num1+num2+num3;
        return addResult;
    }

    public static void main(String[] args) {
        System.out.println(MethodOverloading.add(200,100));
        System.out.println(MethodOverloading.add(300,200,400));
        System.out.println(MethodOverloading.add(300.12,200.30,100));

    }
}
