import java.util.Scanner;
public class Two {
    public static int maxNumber(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a=sc.nextInt();
        System.out.print("Please enter another number: ");
        int b=sc.nextInt();
        int maxi=maxNumber(a,b);
        System.out.println("The number is: "+maxi);
    }
}