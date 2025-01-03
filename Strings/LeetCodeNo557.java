
public class LeetCodeNo557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String[] ch = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i= 0; i<ch.length; i++) {
            StringBuilder rev = new StringBuilder();
            rev.append(ch[i]);
            sb.append(rev.reverse());
            if(i < ch.length-1)
                sb.append(" ");
        }

        return sb.toString();
    }
}
