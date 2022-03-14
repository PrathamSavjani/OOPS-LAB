import java.util.Scanner;
public class Areacir {
    public static void main(String[] args)
    {
        double r,ar,pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of circle ");
        r=sc.nextDouble();
        ar=pi*r*r;
        System.out.print("The area of circle is "+ar);
    }
}