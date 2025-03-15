
//  217. Contains Duplicate

public class LeetCodeNo217 {
     public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));
     }
    static boolean containsDuplicate(int[] nums) {


        bubble(nums);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                return true;
            }
        }

        return false;
    }

    static void bubble(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;

            for(int j = 1; j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    nums[j] = nums[j] ^ nums[j-1];
                    nums[j-1] = nums[j] ^ nums[j-1];
                    nums[j] = nums[j] ^ nums[j-1];
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
  
    }
}
