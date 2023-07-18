import java.util.Scanner;
public class addition {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number for addition");
        int num1 = s.nextInt();
        System.out.println("Enter the First number for addition");
        int num2 = s.nextInt();
        int res = num1+num2;
        System.out.println("The Addition of the 2 numbers is "+res);
    }
}
