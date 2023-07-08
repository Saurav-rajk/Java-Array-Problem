public class Main {
    public static void Permutation(int[] nums) {
        int n = nums.length;
        printArray(nums);

        int[] index = new int[n];
        int i = 0;
        while (i < n) {
            if (index[i] < i) {
                if (i % 2 == 0) {
                    swap(nums, 0, i);
                } else {
                    swap(nums, index[i], i);
                }
                printArray(nums);

                index[i]++;
                i = 0;

            } else{
                index[i]=0;
                i++;
            }
        }


    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Permutation(nums);
    }

}
