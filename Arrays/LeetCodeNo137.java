import java.util.Arrays;

public class LeetCodeNo137 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i+=3){
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
