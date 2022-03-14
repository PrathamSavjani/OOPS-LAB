import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the radius of circle : ");
        float r=sc.nextFloat();
        System.out.println("Please enter the sides of square: ");
        float i=sc.nextFloat();
        float j=sc.nextFloat();
        System.out.println("Please enter the sides of triangle");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        System.out.println("The area of circle is: "+findArea(r));
        System.out.println("The area of square is: "+findArea(i,j));
        System.out.println("The area of triangle is: "+findArea(a,b,c));
    }

    public static float findArea(float r) {
        float pi=22.0f/7;
        return pi*r*r;
    }

    public static float findArea(float i, float j) {
        return i*j;
    }

    public static double findArea(float a, float b, float c) {
        float s=(a+b+c)/2;
        float a_sq=s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(a_sq);
    }
}