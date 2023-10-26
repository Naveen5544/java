import java.util.*;
public class UnBoxingDemo
{
    public static void main(String args[]){
        Integer x=new Integer(30);
        int y=x.intValue();
        int z= x;
        System.out.println("x ="+x);
        System.out.println("y ="+y);
        System.out.println("z ="+z);

    }
}