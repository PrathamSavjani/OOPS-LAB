import java.util.Scanner;
public class Fourth {
    public static void bubble_sort(int m[]){
        int temp=0;
        for(int i=0;i<m.length-1;i++){
            for(int j=0;j<m.length-i-1;j++){
                if(m[j]>m[j+1]){
                    temp = m[j];
                    m[j] = m[j+1];
                    m[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Please enter the elements in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        bubble_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}