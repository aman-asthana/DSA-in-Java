public class CountZerosinNumber {
    public static void main(String[] args) {
        int n = 302004;
        System.out.println(countZero(n));
    }
    static int countZero(int n){
        int count = 0;
        int end = n%10;
        
        if(end==0)
            count++;
        if(n/10==0)
            return count;
        return count + countZero(n/10);
    }
}
