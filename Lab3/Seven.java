import java.util.*;
public class Seven {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter all the sides of a triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int a_square=a*a,b_square=b*b,c_square=c*c;
        if(a==b&&a==c)
        {
            System.out.println("Equilateral Triangle");
        }
        if(a==b&&a!=c&&b!=c)
        {
            System.out.println("Isosceles Triangle");
        }
        if(a!=b&&a!=b&&b!=c)
        {
            System.out.println("Scalane Triangle");
        }
        if(a_square==b_square+c_square||b_square==c_square+a_square||c_square==a_square+b_square)
        {
            System.out.println("Right angle triangle");
        }
    }
}
