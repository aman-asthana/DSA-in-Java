
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            System.out.print(fibo(i));
        }
        
    }
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        
        return fibo(n-1) + fibo(n-2);
        
    }        
}
