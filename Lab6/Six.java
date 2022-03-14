import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        System.out.print("Please enter the order of matrix: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] matrix1=new int[n][n];
        int [][] matrix2=new int[n][n];
        int [][] ans=new int[n][n];
        System.out.println("Please enter the first matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Please enter the second matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=0;
                for(int k=0;k<n;k++){
                    ans[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("The answer is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}