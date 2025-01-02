
//  26. Remove Duplicates from Sorted Array

public class LeetCodeNo26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int track = 1;
        for(int start = 1; start<nums.length; start++){
           
            if(nums[start-1]!=nums[start]){
                nums[track] = nums[start];
                track++;
            }

        }
        return track;
    }
}
