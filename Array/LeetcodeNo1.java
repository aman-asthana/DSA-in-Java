package Array;
class LeetcodeNo1 {
    public static int[] twoSum(int[] nums, int target) {
        int i,j;
        
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+i+", "+j+"]");
                    return new int[] {};
                }
            }
            
        }
        System.out.println("no pair found");
        return new int[] {};
    }
    public static void main(String[] args){
        int arr[] = {2,7,11,15};
        int target = 9;
        twoSum(arr,target);
    }
}