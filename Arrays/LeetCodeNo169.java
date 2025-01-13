import java.util.Arrays;

public class LeetCodeNo169 {
    public static void main(String[] args) {
        int[] nums ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
