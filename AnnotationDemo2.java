import java.io.*;
import java.util.*;
class A {
    void m() {
        System.out.println("Inside method m");
    }
    @ Deprecated
    void n() {
        System.out.println("Inside method n");
    }
}
class AnnotationDemo2 {
    public static void main(String args[]){
        A a=new A();
        a.n();
    }
}