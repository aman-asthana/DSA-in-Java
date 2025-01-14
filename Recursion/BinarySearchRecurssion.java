public class BinarySearchRecurssion {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binaySearch(arr, target, 0, arr.length-1));
    }
    static int binaySearch(int[] arr, int target, int start, int end){
        int mid = start + (end-start)/2;

        if(start>end){
            return -1;
        }

        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]>target){
            return binaySearch(arr, target, start, mid-1);
        }
        return binaySearch(arr, target, mid+1, end);
    }
}
