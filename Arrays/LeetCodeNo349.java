import java.util.ArrayList;
import java.util.Arrays;

public class LeetCodeNo349 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7,8,9,10};
        int[] b = {1,3,4,5,6,8,10};
        System.out.println(Arrays.toString(intersection(a, b)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] == nums2[j] && !list.contains(nums1[i])) {
                list.add(nums1[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }
        int[] arr = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
        arr[k] = list.get(k);
        }
        return arr;

    }
}
