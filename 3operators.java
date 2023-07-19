import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the two numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int add,sub,mul,div,mod;
        add = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        mod = a%b;
        boolean less = a<b;
        boolean greater = a<b;
        boolean le= a<b;
        boolean ge = a<b;
        boolean equal = a<b;
        int andd,nott,orr;
        andd = a||b;

        System.out.println("-------------Arithmetic----------------");
        System.out.println("Addition:"+add);
        System.out.println("subraction:"+sub);
        System.out.println("Multiplication:"+mul);
        System.out.println("division:"+div);
        System.out.println("Modulos:"+mod);
        System.out.println("------------Relational----------------");
        System.out.println("Less than : "+less);
        System.out.println("greater than : "+greater);
        System.out.println("greater than or eqaual to : "+ge);
        System.out.println("Lesser than or equal to : "+le);
        System.out.println("equal : "+equal);
        System.out.println("-------------Conditional---------------");
        int f =(a<b)?a:b;
        System.out.println(f);
    }
}
