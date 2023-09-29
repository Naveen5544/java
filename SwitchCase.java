public class SwitchCase{
    public static void main(String args[]){
        System.out.print("Enter a day number:");
       Scanner sc=new Scanner(System.in);
       int daynumber=sc.nextInt();
       switch(daynumber)
       {
           case 1:
               System.out.println("MONDAY");
               break;
           case 2:
                System.out.println("TUESDAY");
               break;
           case 3:
                System.out.println("WEDNESDAY");
               break;
           case 4:
                System.out.println("THURSDAY");
               break;
           case 5:
                System.out.println("FRIDAY"); 
               break;
            case 6:
                 System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
       }
    }
}
        

OUTPUT:
Enter a day number:7
SUNDAY
OUTPUT:
Enter a day number:5
FRIDAY
