
public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        
            System.out.print(fibo(n));
    }
    static int fibo(int n){
        if((n-2<0)){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
        
    }        
}
