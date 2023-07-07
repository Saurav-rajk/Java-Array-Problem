//Java program to check if a sub-array is formed by consecutive integers from a given array of integers.
public class Main{
    public static void main(String[] args){
        int[] num={2,1,4,3,5,9,0,1};
        int start=0;
        int end=0;
        int len=0;
        for(int i=0;i<num.length-1;i++){
            int max_val=num[i];
            int min_val=num[i];
            for(int j=i+1;j<num.length;j++){ // This loop compare the number.
                max_val=Math.max(max_val,num[j]);
                min_val=Math.min(min_val,num[j]);

                boolean IsConsecutive=true;
                if(max_val-min_val != j-i){  // It check the two is consecutive or not.
                    IsConsecutive=false;
                }
                boolean [] check=new boolean[max_val-min_val+1]; // It checks the duplicate number occur in array
                for(int k=i;k<=j;k++){
                    if(check[num[k]-min_val]){
                        IsConsecutive = false;
                    }
                    check[num[k]-min_val]=true;
                }
                if(IsConsecutive && len<max_val-min_val+1){
                    len=max_val-min_val+1;  // It update in every loop to keep the track of index.
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println("Length of subarray: "+len);
        System.out.print("Element of subarray: ");
        for(int x=start; x<=end;x++){
            System.out.print(num[x]+" ");
        }
    }
}

  