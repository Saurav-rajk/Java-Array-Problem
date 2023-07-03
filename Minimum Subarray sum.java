//Java program to find the minimum subarray sum of specified size in a given array of integers.

import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr1={4,2,5,1,6,7};
        int n=arr1.length;
        int k=3;
        if(k==0||k>n){
            System.out.println("Invalid input");
        }
        int minSum=Integer.MAX_VALUE; // it is a pre-built function which is a maxm value in java.
        int startIndex=0;
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum+=arr1[i];
        }
        minSum=Math.min(minSum,currentSum);
        for(int i=k;i<n;i++){
            currentSum+=arr1[i]-arr1[i-k];
           if(minSum>currentSum){ // Condition for finding minsum.
               minSum=currentSum;
               startIndex=i-k+1;
           }
        }
        int[]subArr= Arrays.copyOfRange(arr1, startIndex, startIndex + k); // it gives min array.
        System.out.println("Minimum subarray: "+Arrays.toString(subArr));
        System.out.println("Minimum subarray sum is: "+minSum);
    }

}