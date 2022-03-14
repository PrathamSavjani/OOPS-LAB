import java.util.Scanner;

public class One {
    float simpleInterest(float p,float r,int n){
        return p*r*n/100.0f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the principle amount: ");
        float p=sc.nextFloat();
        System.out.print("\nPlease enter the rate of Interest: ");
        float r=sc.nextFloat();
        System.out.print("\nPlease enter the number of years you want to invest: ");
        int n=sc.nextInt();
        One si=new One();
        float ans=si.simpleInterest(p,r,n);
        System.out.print("\nThe simple Interest of amount "+p+" at rate "+r+"for years "+n+" is "+ans);
    }
}