import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args)
    {
        System.out.println("enter the year to check leap year or not");
        Scanner s = new Scanner(System.in);
        int year=s.nextInt();
        int c= year%4;
        int d= 4-c;
        if(c==0)
        {
            System.out.println("it is leap year");
        }
        else
        {
            System.out.println("it is not a leap year");
        }
    }
}
