import java.util.Scanner;
public class circle{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float r = s.nextFloat();
        double area = r*r*Math.PI;
        double circum = 2*Math.PI*r;
        System.out.println("Circumstace of the circle : "+circum);
        System.out.println("Area of the circle : "+area);
    }
}
