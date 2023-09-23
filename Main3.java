import java.util.*;
import java.lang.*;
public class Main3 {
    static{
        System.out.println("Enter a positive integer to check prime or not");
        
    }
    public static void main(String[] args) {
        int num =Integer.parseInt(args[0]);
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}