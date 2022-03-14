import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,r;
        while (n!=0) {
            r=n%10;
            sum = sum*10+r;
            n=n/10;
        }
        System.out.println("The reversed number is equal to: "+sum);
    }
}