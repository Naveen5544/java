
//To find the given number is palindrome(or)not
//26/08/2023
//NumPalindrome.java
import java.io.*;
import java.util.*;

public class NumPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n integers i between 1 to 20: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (n > 0 || n != 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println("After reversing the number is " + rev);
        if (rev == temp) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + "is not a palindrome");
        }
    }
}