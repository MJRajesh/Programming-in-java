import java.io.*;
import java.util.*;
class Untitled
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number;");
        int n = s.nextInt();
        int sum=0,rem=0,temp;
        temp=n;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(temp%sum==0)
        {
            System.out.println("It is a harshad number");
        }
        else
        {
            System.out.println("It is not a harshad number");
        }
        int sum2=0;
        for(int i=1;i<temp;i++)
        {
            if(temp%i==0)
            {
                sum2=sum2+i;
            }
        }
        if(sum2==temp)
        {
            System.out.println("it is perfect number");
        }
        else
        {
            System.out.println("it is not a perfect number");
  }
}
}
