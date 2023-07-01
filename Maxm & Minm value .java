// Java program to find the maximum and minimum value of an array.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {8, 14, 18, 2, 10};
        int max = arr1[0];
        int min=arr1[0];

        for (int i = 0; i < arr1.length ; i++) {
            int larger = i;
            if (arr1[larger] > max) {
                max = arr1[larger];
            }
            if(arr1[larger]<min){
                min=arr1[larger];
            }
        }
        System.out.print("Maximum value of array: ");
        System.out.println(max);
        System.out.print("Minimum vlaue of array: ");
        System.out.println(min);
    }
}
