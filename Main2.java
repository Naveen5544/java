import java.util.*;
import java.lang.*;
public class Main2 {

  public static void main(String[] args) {
      System.out.println("Enter a positive integer");
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
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