
//Java program to compute the average value of an array of integers except the largest and smallest values.
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[]arr1={2,12,22,29,21};
        Arrays.sort(arr1);
        double sum=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr1[0] || arr1[i]==arr1[arr1.length-1]){
                continue;
            }
            else{
                sum +=arr1[i];
            }

        }
        double ans=sum/2;
        System.out.println((ans));

    }

}

