public interface LeetCodeNo125 {
    public static void main(String[] args) {
        String s = "0P";
        
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toLowerCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>= 'a' && ch[i] <= 'z'){
                sb.append(ch[i]);
            }
            if(ch[i]>= '0' && ch[i]<= '9'){
                sb.append(ch[i]);
            }
        }
        String str = sb.toString();
        
        return str.equals(sb.reverse().toString());
    }
}
