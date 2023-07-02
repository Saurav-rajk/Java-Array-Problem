// Java program to find the number of even and odd integers in a given array of integers.
public class Main{
    public static void main(String[] args){
        int[] arr1={3,2,6,4,5,9};
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                count++;
            }
        }
        int[] evenArr1=new int[count];
        int index=0;
        int[] oddArr2=new int[arr1.length-count];
        int ind=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                evenArr1[index]=arr1[i];
                index++;
            }
            else{
                oddArr2[ind]=arr1[i];
                ind++;
            }

        }
        System.out.print("Even no: ");
        for(int i=0;i<evenArr1.length;i++){
            System.out.print(evenArr1[i]+" ");


        }
        System.out.println();
        System.out.print("Odd no: ");
        for(int i=0;i<oddArr2.length;i++){
            System.out.print(oddArr2[i]+" ");
        }
    }

}
