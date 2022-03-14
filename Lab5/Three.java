import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        System.out.println("Enter the limit till you want to print fibonacii series: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFibo(n);
    }

    public static void printFibo(int n) {
        if(n==1){
            System.out.println("0");
            return;
        }
        else if(n==2){
            System.out.println("0,1");
            return;
        }
        else{
            System.out.print("0,1,");
            int a=0,b=1,temp=0;
            for(int count=3;count<=n;count++){
                System.out.print(a+b+",");
                temp=a;
                a=b;
                b=temp+b;
            }
            System.out.print("\b \b");
        }
    }
}