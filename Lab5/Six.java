import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        System.out.println("Please enter the two numbers whose gcd you want to find: ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Six hcf=new Six();
        System.out.println("The gcd of "+num1+" and "+num2+" is "+hcf.gcd(num1,num2));
    }
    public int gcd(int num1,int num2){
        if (num1<num2) {
            for(int i=num1;i>0;i--){
                if(num1%i==0&&num2%i==0)
                    return i;
            }
        }
        else{
            for(int i=num2;i>0;i--){
                if(num1%i==0&&num2%i==0)
                    return i;
            }
        }
        return 1;
    }
}