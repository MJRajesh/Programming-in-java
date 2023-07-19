import java.util.Scanner;
public class garde{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the Mark:");
        int b=s.nextInt();
        if(b>=90)
        {
                System.out.println("A-Grade");
        }
        else if (b>=80)
        {
            System.out.println("B Grade");
        }
        else if(b>=50)
        {
            System.out.println("C is grade");
        }
        else
        {
            System.out.println("fail");
        }
    }
