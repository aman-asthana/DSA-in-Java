public class ReverseInteger{
    static int result = 0;
    public static void main(String[] args) {
        int n = 123;
        System.out.println(revNum(n));
    }
    static int revNum(int n){
        
        if(n<10){
            return result*10 + n;
        }
        int end = n%10;
        result = result*10 + end;
        return revNum(n/10);
    }
}