import java.util.Scanner;
public class Seven {
    public static void selection_sort(int m[]){
        int index=0,temp,min;
        for(int i=0;i<m.length;i++){
            min=m[i];
            index=i;
            for(int j=i;j<m.length;j++){
                if(min>m[j]){
                    min=m[j];
                    index=j;
                }
            }
            temp=m[i];
            m[i]=m[index];
            m[index]=temp;
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
        selection_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}