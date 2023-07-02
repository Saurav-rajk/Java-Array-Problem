//Java program to add two matrices of the same size.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of row: ");
        int m=sc.nextInt();
        System.out.println("Enter size of column: ");
        int n=sc.nextInt();
        int[][]arr1=new int[m][n];
        int[][] arr2=new int[m][n];
        int[][]sum=new int[m][n];
        System.out.println("Input element of arr1: ");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                arr1[c][d]=sc.nextInt();
            }
        }
        System.out.println("Input element of arr2: ");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                arr2[c][d]=sc.nextInt();

            }
        }
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                sum[c][d]=arr1[c][d]+arr2[c][d];
            }
        }
        System.out.println("Sum of matrices:");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                System.out.print(sum[c][d]+" ");
            }
            System.out.println();
        }


    }

}