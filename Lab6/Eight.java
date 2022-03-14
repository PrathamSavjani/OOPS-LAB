import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        System.out.println("Please enter the elements of 4X4 array: ");
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int [] sumc=new int[4];
        for(int i=0;i<4;i++){
            sumc[i]=0;
            for(int j=0;j<4;j++){
                sumc[i] += arr[j][i];
            }
        }
        int [] sumr=new int[4];
        for(int i=0;i<4;i++){
            sumr[i]=0;
            for(int j=0;j<4;j++){
                sumr[i] += arr[i][j];
            }
        }
        System.out.print("Sum of columns is: ");
        for(int i=0;i<4;i++)
            System.out.print(sumc[i]+" ");
        
        System.out.print("Sum of rows is: ");
        for(int i=0;i<4;i++)
            System.out.print(sumr[i]+" ");
    }
}