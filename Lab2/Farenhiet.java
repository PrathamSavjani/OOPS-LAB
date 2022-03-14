import java.util.*;
public class Farenhiet{
    public static void main(String[] args)
    {
        float f,c;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the value in Farenhiet");
        f=s.nextFloat();
        c=((f-32)*5)/9;
        System.out.println("The degree celcius of given degree ferenhiet is "+c+"degree celcius");
    }
}