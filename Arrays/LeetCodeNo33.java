
//  33. Search in Rotated Sorted Array

public class LeetCodeNo33 {

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        int target = 5;

        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //  CASE 1: If array is not rotated
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        

        //  CASE 2: if pivot == target
        if(target == nums[pivot]){
            return pivot;
        }

        //  CASE 3: if start of array is less than target than search till pivot-1
        if(target>nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        //  ELSE seach form pivot+1 till last of array
        return binarySearch(nums, target, pivot+1,nums.length-1);
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;


        while( start<=end ){
            int mid = start + (end-start)/2;

            //below are the 4 CASE for finfding the pivot (largest element in the rotated array)

            //  CASE 1:  if element of mid+1 < mid element than basicallu this is pivot
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            //  CASE 2: also in that condition mid-1 < mid element it is also a pivot
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            //  CASE 3: if element of start>= mid element so is that possible than the piviot is lies in --mid indexes
            if(nums[mid]<=nums[start]){
                end = mid - 1;
            }else{

            //CASE 4: else the pivot is lies on the mid++ indexes
                start = mid + 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        ///////////Basic Binay Search/////////////
        
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                return mid;
            }
            
        }
        
        return -1;
    }
}
