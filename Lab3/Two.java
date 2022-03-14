import java.util.*;
public class Two {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            System.out.println("The entered character is vowel");
        else
            System.out.println("The entered character is consonent");
    }
}
