
//Java program to find the Factorial of given number
//25/08/2023
//FactorialNumber.java
import java.io.*;
import java.util.*;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n integer value in between 1 to 20:");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Fact of first " + n + " natural numbers is " + fact);
    }
}