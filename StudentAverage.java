//To calculate the average of a student
//22/08/2023
//StudentAverage.java
import java.io.*;
import java.util.*;
public class StudenAverage{
public static void main(String[] args){
int m1,m2,m3;
System.out.prinln("Enter marks of 3 subjects:");
scanner sc=new scanner(System.in);
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
float avg=(float)total/3;
if(avg>75)
{
	System.out.println("Student passed in distinction");

else if(avg>=60 && avg<75)
{
	System.out.ln("Student passed in first class");

else if(avg>=50 && avg<60)
{
	System.out.println("Student passed in second class");
else if(avg>=40 && avg<50)
{
system.out.println("Student assed in third class");
else
{
	System.out.println("Student failed");
}
}
}
}
}
}
}
