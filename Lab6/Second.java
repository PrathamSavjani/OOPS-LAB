import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Please enter the elements in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0||arr[i]%5==0)
                count++;
        }
        System.out.println("Your required answer is: "+count);
    }
}