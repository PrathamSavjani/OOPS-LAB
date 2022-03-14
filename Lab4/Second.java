import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),fact=1;
        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        System.out.println("The factorial of a given number is: "+fact);
    }
}