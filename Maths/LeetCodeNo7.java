public class LeetCodeNo7 {
    public static void main(String[] args) {
        int y = 10;
        System.out.println(reverse(y));
    }
    static int reverse(int x) {
        double  result = 0;
        
        while (x !=0 ){
            double end = x % 10;
            double newResult = result *10+end;

            if(newResult > Integer.MAX_VALUE || newResult < Integer.MIN_VALUE){
            return 0;
            }

            result = newResult;
            x = x/10;
        }
        return (int)result;
    }
}
