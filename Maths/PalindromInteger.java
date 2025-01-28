
public class PalindromInteger {
   public static void main(String[] args) {
    int x = 123;
    System.out.println(isPalindrome(x));
   }
   static boolean isPalindrome(int x){
    int rev = reverse(x);

    return x==rev;
   }
   static int result = 0;
   static int reverse(int x){
        int end = x%10;
        if(x<10){
            return result*10 + x;
        }
        result = result*10+end;
        return reverse(x/10);
   }
   
}
