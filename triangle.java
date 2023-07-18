import java.util.Scanner;
class triangle{
    public static void main(String args[])
    {
       Scanner q = new Scanner(System.in);
       System.out.println("enter the height");
       int h = q.nextInt();
       System.out.println("enter the breath");
       int b = q.nextInt();
       int res=0;
       res = (h*b)/2;
       System.out.println("the area of the triangle is "+res);
    }
}
