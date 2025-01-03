public class LeetCodeNo709 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >=65 && ch[i] <= 90){
                ch[i] =(char) ((char)  ch[i]+32);
                sb.append(ch[i]);
            }else{
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
