import java.util.*;
public class Six{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum1=0,sum2=0,i=0;
        System.out.println("Enter the numbers: ");
        while (true) {
            i=sc.nextInt();
            if(i==0)
              break;
            if(i%2==0&&i>0)
                sum1 += i;
            if(i%2!=0&&i<0)
                sum2 += i;
        }
        System.out.println("The sum of positive even number is: "+sum1);
        System.out.println("The sum of negative odd number is: "+sum2);
    }
}