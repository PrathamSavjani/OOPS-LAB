import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Please enter the elements in array: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Please enter the element you want to search: ");
        int sr=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==sr){
                System.out.println(arr[i]+" is at position "+(i+1));
                System.exit(1);
            }
        }
        System.out.println("Not Found anything!!");
    }
}