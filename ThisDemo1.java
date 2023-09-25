//To demonstrate the importance of using this keyword
//09/09/23
import java.io.*;
import java.util.*;
class Student {
    int rno;
    String name;
    double fee;
    
   void StudentConstructor(int rno,String name,double fee){
    rno=rno;
    name=name;
    fee=fee;
    }
    void display()
    {
        System.out.println("The student details are: ");
        System.out.println(rno+" "+name+" "+fee);
    }
}
class ThisDemo1
{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.StudentConstructor(505,"Naveen",22.500);
        s2.StudentConstructor(11,"RMVN",99.999);
        s1.display();
        s2.display();
    }
}