
import java.util.Arrays;

public class LeetCodeNo344 {
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o"};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverseString(String[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<=end){
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }  
}