public class LeetCodeNo69 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x) {
        long i;
        for(i = 1; (i*i)<=x; i++) {
            // loop body is intentionally empty
        }
        return (int)i-1;
    }
}
