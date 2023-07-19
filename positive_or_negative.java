import java.util.Scanner;
public class positive_or_negative{
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int year=s.nextInt();
        if(year>0)
        {
            System.out.println("positive");
        }
        else if (year<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("neither positive or negative");
        }
    }
}
