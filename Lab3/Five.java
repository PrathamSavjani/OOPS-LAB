import java.util.*;
public class Five {
    public static void main(String args[])
    {
        int a,b,c,res;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        res=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(res+" is the gratest");
    }
}
