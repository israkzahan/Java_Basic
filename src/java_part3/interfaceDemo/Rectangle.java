package java_part3.interfaceDemo;

public class Rectangle implements  Polygon{
    public  void  getArea(int length, int breadth){
       System.out.println("The area of the rectangle is : " +(length*breadth));
    }
}
