import java.util.Scanner;
public class Six {
    public static void main(String[] args)
    {
        double BMI,height,weight;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your height in meters:");
        height=sc.nextDouble();
        System.out.print("Please enter your weight in KiloGrams:");
        weight=sc.nextDouble();
        BMI=weight/(height*height);
        System.out.println("The BMI of a person is:"+BMI);
    }
}