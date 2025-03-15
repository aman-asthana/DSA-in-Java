public class LeetCodeNo219 {
    public static void main(String[] args) {
        int[] nums1 = {1,0,1,1};
        int k = 1;

        System.out.println(containsNearbyDuplicate(nums1, k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++){
                if(nums[i]==nums[j]){
                    int cmp = j-i;
                    return cmp<=k;
                }
            }
        }
        return false;
    }
}
