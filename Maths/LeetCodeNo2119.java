public class LeetCodeNo2119 {
    public static void main(String[] args) {
        int num = 1800;
        System.out.println(isSameAfterReversals(num));
    }
    
    static boolean isSameAfterReversals(int num) {
        if(num/10==0){
            return true;
        }else if(num%10==0){
            return false;
        }
        return true;
    }
}
