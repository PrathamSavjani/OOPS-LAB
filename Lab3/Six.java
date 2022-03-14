import java.util.*;

public class Six {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        int c;
        while(true)
        {
            System.out.println("Please enter the number1: ");
            a=sc.nextDouble();
            System.out.println("Please enter the number2: ");
            b=sc.nextDouble();
            System.out.println("Please enter the number\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for exit");
            c=sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.println(a/b);
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Psyc that's the wrong number");
                    break;
            }
        }
    }
}
