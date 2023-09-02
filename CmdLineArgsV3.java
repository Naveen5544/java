//cmd line
//arithematic operation
//string length
//object class
//simple inheritance
import java.io.*;
public class CmdLineArgsV3  extends Object {
    public static void main (String[] args){
        CmdLineArgsV3 obj =new CmdLineArgsV3();
        if(args.length!=2)//they not contain paranthesis for length.
        {
            System.out.println("Invalid number of arguments \n you need to pass two integers in between 0 to 10,000");
        }
        else
        {
        int x = Integer.parseInt(args[0]);//wrapper classes
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("The class name is :-"+" obj.getClass()");
        System.out.println("Sum of "+x+" and "+y+" is "+z);
        }
    }
}
