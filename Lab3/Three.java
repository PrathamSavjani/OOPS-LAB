import java.util.*;
public class Three {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is gratest");
            }
            else
            {
                System.out.println("C is gratest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("B is gratest");
            }
            else
            {
                System.out.println("C is gratest");
            }
        }
    }
}