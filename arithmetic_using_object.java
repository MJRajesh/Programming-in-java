import java.io.*;
import java.util.*;
class natural
{
public static void main(String args[])
{

System.out.println("Enter the two numbers");
sum obj=new sum();
obj.add();
obj.sub();
obj.mul();
obj.div();
}
}
class sum
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
    int c;
    void add()
    {
        
        System.out.println("addition of number is");
        c=a+b;
        System.out.println(c);
    }
    void sub()
    {
        System.out.println("sub of number is");
        c=a-b;
        System.out.println(c);
    }
    void mul()
    {
        System.out.println("mulitiplication of number is");
        c=a*b;
        System.out.println(c);
    }
    void div()
    {
        System.out.println("division of number is");
        c=a/b;
        System.out.println(c);
    }
}
