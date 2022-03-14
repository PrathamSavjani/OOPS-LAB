import java.util.*;
public class Percentage {
    public static void main(String[] args)
    {
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please entere the marks of five subject 1");
        a=sc.nextInt();
        System.out.println("Please entere the marks of five subject 2");
        e=sc.nextInt();
        System.out.println("Please entere the marks of five subject 3");
        b=sc.nextInt();
        System.out.println("Please entere the marks of five subject 4");
        c=sc.nextInt();
        System.out.println("Please entere the marks of five subject 5");
        d=sc.nextInt();
        float percentage = (a+b+c+d+e)/5;
        System.out.print("The percentage is:"+percentage);
    }
}
