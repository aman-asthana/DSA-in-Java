
//  66. Plus One

import java.util.Arrays;

public class LeetcodeNo66 {
    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        //System.out.println(plusOne(digits));
        System.out.println(Arrays.toString(plusOne(digits)));
    }    
    
    static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArr = new int[len+1];
        newArr[0]=1;
        return newArr;
    }
}
