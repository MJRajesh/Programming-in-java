import java.util.Scanner;

public class voting{
    public static void main(String[] args)
    {
        System.out.println("enter the age");
        Scanner s = new Scanner(System.in);
        int age=s.nextInt();
        if (age>=18)
        {
            System.out.println("your are eligible to vote");
        }
        else
        {
            System.out.println("your eligible to vote");
            int rem;
            rem = 18-age;
            System.out.println(rem+"years is remaining to eligible for vote");
        }
    }
}
