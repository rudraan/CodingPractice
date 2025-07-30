package ArrayProblems;

public class LargestElementInArray {

    public static void main(String[] args) {
        int arr[] = {3, 3, 6, 1};
        int largestNum = largestElement(arr);
        System.out.println(largestNum);

        int arr2[] = {3, 3, 0, 99, -40};
        int largestNum2 = largestElement(arr2);
        System.out.println(largestNum2);

    }

    public static int largestElement(int[] nums) {
        int largestNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNum) {
                largestNum = nums[i];
            }
        }
        return largestNum;
    }
}
