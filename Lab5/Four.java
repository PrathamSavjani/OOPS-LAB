import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number that you want to check: ");
        int a=sc.nextInt();
        boolean b=check(a);
        if (b) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public static boolean check(int n) {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
