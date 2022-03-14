import java.util.Scanner;
public class Five {
    public static void main(String[] args)
    {
        double m,ft;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the height in meters:");
        m=sc.nextDouble();
        ft=m*3.281;
        System.out.println("The size in feet will be:"+ft);
    }
}
