public class LeetCodeNo231 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;

    return n%2==0 && isPowerOfTwo(n/2);
    }
}
