
//  9. Palindrome Number

public class LeetCodeNo9 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        int value;
        int sum = 0;
        int y =x;
        while(x>0){
            value = x%10;
            sum = sum * 10 + value;
            x = x / 10;
        }
        return sum == y;
    }
}