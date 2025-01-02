public class LeetCodeNo35 {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int target = 2;
        System.out.println(searchInsert(nums1, target));

    }
    static int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
       
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }
        }
        
        return start;
    }
}
