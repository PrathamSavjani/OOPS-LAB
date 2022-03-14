import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Please enter the lower limit:");
        a=sc.nextInt();
        System.out.println("Please enter the upper limit: ");
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%2==0&&i%3!=0)
            {
                System.out.println(i);
            }
        }
    }
}