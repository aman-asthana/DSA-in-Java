

public class LeetCodeNo8 {
    public static void main(String[] args) {
        String s = "-42999";
        System.out.println(myAtoi(s));
    }
    static int myAtoi(String s) {
        s = s.trim();
        long integer=0;
        int sign = 1, i=0;

        if(s.charAt(0)=='-'){
            sign = -1;
            i++;
        }else if(s.charAt(0)=='+'){
            i++;
        }

        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9')
                break;
            
            integer = integer * 10 + (ch - '0');

            if (sign * integer > Integer.MAX_VALUE) 
                return Integer.MAX_VALUE; // Handle overflow
            if (sign * integer < Integer.MIN_VALUE) 
                return Integer.MIN_VALUE;
            i++;
        }

        
        
        return (int) (sign * integer);
    }
}
