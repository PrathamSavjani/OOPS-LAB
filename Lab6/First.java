import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        int even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.print("Please enter the elements: ");
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        for (int i=0;i<arr.length;i++) {
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even numbers are: "+even);
        System.out.println("Number of odd numberss are: "+odd);
    }
}