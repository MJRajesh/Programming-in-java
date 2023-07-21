import java.io.*;
import java.util.*;
class Untitled
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to checck it is palindrome or not;");
        int n = s.nextInt();
        int i=0,rev=0,temp;
        temp=n;
        while(n!=0)
        {
            i=n%10;
            rev=(rev*10)+i;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}
        }
    }
}
