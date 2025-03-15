import java.util.Arrays;
public class LeetCodeNo189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    

    static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        swap(nums, 0, len-1);
        swap(nums, 0,k-1);
        swap(nums, k,len-1);
        
    }

    static void swap(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
