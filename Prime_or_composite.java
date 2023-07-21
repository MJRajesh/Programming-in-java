import java.io.*;
import java.util.*;
class Untitled
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter the number");
        int n[]=new int[10];
        for(int i=0;i<5;i++)
        {
        n[i]=s.nextInt();
        }
        int temp=0;
        for(int k=1;k<5;k++)
        {
        for(int i=1;i<=n[k];i++)
        {
            if(n[k]%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp==2)
        {
            System.out.println(n[k]+" is a prime number");
            temp=0;
        }
        else
        {
            System.out.println(n[k]+" is a composite number");
        temp=0;
        }
        }
    }
}
