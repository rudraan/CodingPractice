package ArrayProblems;

public class SecondLargestElementInArray {

    public static void main(String args[]){

        int arr[] = {8, 8, 7, 6, 5};
        int secondLargestElement = secondLargestElement(arr);
        System.out.println(secondLargestElement);

        int arr2[] = {10, 10, 10, 10, 10};
        int secondLargestElement2 = secondLargestElement(arr2);
        System.out.println(secondLargestElement2);
    }
    public static int secondLargestElement(int[] nums) {
        int largestElement = nums[0];
        int secondLargestElement = -1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > largestElement){
                secondLargestElement = largestElement;
                largestElement = nums[i];
            }
            else if(nums[i] > secondLargestElement && nums[i] != largestElement){
                secondLargestElement = nums[i];
            }
        }
        return secondLargestElement;
    }
}
