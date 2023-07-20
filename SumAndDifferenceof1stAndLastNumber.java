import java.io.*;
import java.util.*;
class natura{
public static void main(String args[])
{
int n[]=new int[5];int i;
Scanner s=new Scanner(System.in);
System.out.print("Enter thre nunmber");
for(i=0;i<5;i++)
{
n[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
System.out.println(n[i]);
}
int k=n[0]+n[4];
int p=n[0]-n[4];
System.out.println("sum"+k);
System.out.println("Diff"+p);
}
}
