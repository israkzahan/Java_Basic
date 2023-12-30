package core_java_part2.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] myNumbers = {
                {1, 2, 3, 4, 5, 6, 7},//0
                {10, 20, 30, 40, 50, 80, 56},//1
                {11, 12, 45, 52, 12, 51, 23},
                {11, 12, 45, 52, 12, 51, 23} }; //2

//0,1,2,3,4,5,6
                for(int q=0;q<myNumbers.length;q++){
                    System.out.println(myNumbers[2][0]);
                };

        System.out.println("Print the values: "+myNumbers[2][3]);
        System.out.println(myNumbers.length);
    };

};
