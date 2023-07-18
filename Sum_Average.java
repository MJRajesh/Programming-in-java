import java.util.Scanner;
public class Sum_Average{
    public static void main(String[] args)
    {
        int i,n=0,s=0;
        double avg;
        {
            System.out.println(" Give Input for the 5 numbers : ");
        }
        for (i=0;i<5;i++)
        {
            Scanner ik= new Scanner(System.in);
            n = ik.nextInt();
            s +=n;
        }
        avg=s/5;
        System.out.println("The sum of the 5 number is"+s);
        System.out.println("The average of the 5 number is"+avg);
    }
}
