import java.util.*;
public class Four {
    public static void main(String args[])
    {
        double s1,s2,s3,s4,s5,p;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextDouble();
        s2=sc.nextDouble();
        s3=sc.nextDouble();
        s4=sc.nextDouble();
        s5=sc.nextDouble();
        p=(s1+s2+s3+s4+s5)/5;
        if(p<35)
            System.out.println("Fail");
        else if(p>=35&&p<45)
            System.out.println("Pass");
        else if(p>=45&&p<60)
            System.out.println("Second");
        else if(p>=60&&p<70)
            System.out.println("First");
        else if(p>70)
            System.out.println("Distinction");
    }
}
