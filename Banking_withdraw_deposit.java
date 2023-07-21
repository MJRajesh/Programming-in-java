import java.io.*;
import java.util.*;
class natural
{
public static void main(String args[])
{
System.out.println("enter the coice 1 for withdraw 2 for deposit");
Scanner s=new Scanner(System.in);
int ch=s.nextInt();
sum obj=new sum();
switch(ch)
{
    case 1:
        obj.withdraw();
    break;
    case 2:
        obj.deposit();
    break;
}
}
}
class sum
{
 int amount=10000,c,bal;
 void withdraw()
 {
    Scanner s=new Scanner(System.in);
    c=s.nextInt();
    bal=amount-c;
    System.out.println("The balance is:"+bal);
 }
void deposit()
 {
    Scanner s=new Scanner(System.in);
    c=s.nextInt();
    bal=amount+c;
    System.out.println("The balance is:"+bal);
 }
}
