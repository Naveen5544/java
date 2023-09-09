//Java program to find n natural numbers
//25/08/2023
import java.io.*;
import java.util.*;
public class SumOfNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n integer value in between 1 to 20:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of first "+n+" natural numbers is "+sum);
	}
}