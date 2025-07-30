package ArrayProblems;

import java.util.Arrays;

public class MoveZeroesToEndInArray {
    public static void main(String args[]){

        int arr[] = {0, 1, 4, 0, 5, 2};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

        int arr2[] = {0, 0, 0, 1, 3, -2};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void moveZeroes(int[] nums) {
        int putNonZeroElement = 0;
        int temp;
        for(int current=0; current<=nums.length-1;current++){
            if(nums[current] != 0){
                temp = nums[putNonZeroElement];
                nums[putNonZeroElement] = nums[current];
                nums[current] = temp;
                putNonZeroElement++;
            }
        }
    }
}
