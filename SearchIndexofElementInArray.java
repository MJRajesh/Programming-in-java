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
int search=5;
for(i=0;i<5;i++)
{
if(n[i]==search)
{
System.out.println("the searche element is founded at index"+i);
}

}
}
}
