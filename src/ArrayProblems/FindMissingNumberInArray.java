package ArrayProblems;

public class FindMissingNumberInArray {

    public static void main(String args[]){

        int arr[] = {0, 2, 3, 1, 4};
        int missingNumberIs = missingNumber(arr);
        System.out.println(missingNumberIs);

        int arr2[] = {0, 1, 2, 4, 5, 6};
        int missingNumberIs2 = missingNumber(arr2);
        System.out.println(missingNumberIs2);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int missingNum = n;
        for(int no : nums){
            missingNum = missingNum ^ no;
        }

        for(int i=0;i<n;i++){
            missingNum = missingNum ^ i;
        }
        return missingNum;

    }
}
