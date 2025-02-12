public class LeetCodeNo485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }else if(nums[i]==0){
                
                if(maxCount<count){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if(maxCount<count){
                    maxCount = count;
                }
        return maxCount;
    }
}
