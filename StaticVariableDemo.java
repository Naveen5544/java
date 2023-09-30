import java.io.*;
class Student{
    int rno;
    String name;
    static String clg="SITE";
    Student(int r,String n)
    {
        rno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rno+" "+name+ " "+clg);
    }
}
public class staticVaribleDemo{
    public static void main(String args[]){
        Student s1=new Student(568,"chandu");
        Student s2=new Student(567,"nadeem");
        System.out.println("Student details are :");
        s1.display();
        s2.display();
    }
}

OUTPUT:
Student details are :
568 chandu SITE
567 nadeem SITE
