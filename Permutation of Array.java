
public class Main{
    public static void main(String[] args){
        int [] num={2,3,4};
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        int[]index=new int[n]; // Declare new array for compare value but the value in this array is [0,0,0] .
        int i=0;
        while(i<n){
            if(index[i]<i){ // This loop compare the index[i] with i;
                if(i % 2==0){
                    int temp=num[0];
                    num[0]=num[i];
                    num[i]=temp;
                }else{
                    int temp=num[index[i]];
                    num[index[i]]=num[i];
                    num[i]=temp;
                }
                for(int x=0;x<n;x++){
                    System.out.print(num[x]+" ");
                }
                System.out.println();
                index[i]++;  // it will increase the index[i] with 1 means change from 0 to 1.
                i=0; // reset the value of i.

            } else{
                index[i]=0; // it will change the index[i] value i.e 0.
                i++;
            }
        }

    }
}