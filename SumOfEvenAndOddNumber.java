import java.io.*;
import java.util.*;
class natura{
public static void main(String args[])
{
int n[]=new int[5];int i,sum2=0,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter thre nunmber");
for(i=0;i<5;i++)
{
n[i]=s.nextInt();
}
System.out.print("-----Display------");
for(i=0;i<5;i++)
{
if(n[i]%2==0)
{
sum=n[i]+sum;
}
else
{
sum2=n[i]+sum2;
}
}
System.out.println("sum of even"+sum);
System.out.println("sum of odd"+sum2);
}
}
