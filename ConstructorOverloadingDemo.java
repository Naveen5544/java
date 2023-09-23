//05/09/23
//ConstructorOverloadingDemo.java
import java.io.*;
import java.util.*;
class Square{
    int s;
    Square()
    {
        s=5;
    }
    Square(int x)//parameterised ConstructorOverloadingDemo
    {
        s=x;
    }
    void Area(){
        System.out.println("Area of square is "+(s*s));
    }
}
class ConstructorOverloadingDemo{
   public static void main(String args[]){
       Square s1= new Square();
       Square s2= new Square(8);
       s1.Area();
       s2.Area();
   }
}