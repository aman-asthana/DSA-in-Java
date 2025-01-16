public class GCDorLCM {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 9;
        System.out.println(gcd(n1, n2));
        System.out.println(LCM(n1, n2));
    }
    static int gcd(int n1, int n2){
        int min;
        if(n1<n2){
            min = n1;
        }else
            min = n2;
        
        //////////GCD/////////
        for(int i = min; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return -1;
    }

    static int LCM(int n1, int n2){
        int n =1;
        /////****LCM****//////
        while(true){
            if((n1*n)%n2 == 0){
                return n1*n;
            }
            n++;
        }
    }
}
