import java.util.*;
public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0f;
        for(int i=1;i<=n;i++)
        {
            sum += 1.0/i;
        }
        System.out.println("Sum is: "+sum);
    }
}