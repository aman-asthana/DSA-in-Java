import java.util.Arrays;

public class LeetCodeNo2149 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    static int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int even = 0;
        int odd = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                arr[even] = nums[i];
                even = even +2;
            }else if(nums[i]<0){
                arr[odd] = nums[i];
                odd += 2;
            }
        }
        return arr;
    }
}
