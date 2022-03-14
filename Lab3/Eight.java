import java.util.*;
public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the units");
        int calls=sc.nextInt();
        double bill=0;
        if(calls<=100)
            bill=200;
        else if(calls<=150)
            bill=200+(0.60)*(calls-100);
        else if(calls<=200)
            bill=230+(0.50)*(calls-150);
        else if(calls<=250)
            bill=255+(0.40)*(calls-200);
        System.out.println("The bill of rupees "+bill+" is generated");
    }
}