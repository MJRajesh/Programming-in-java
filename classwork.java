public class classwork{
    public static void main(String[] args)
    {
        int x,y,z;
        x=5;
        y=7;
        z=-2;
        x++;
        y=(y--)-x;
        z=x+y-(--z);
        x+=5;
        y/=5;
        z%=10;
        x++;
        y--;
        ++z;
        z=x+y;
        x=y-z;
        y=x*z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
}
}
