

public class LeetCodeNo58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        String[] split = s.trim().split(" ");
        String str = split[split.length-1].trim();
        return str.length();
    }
}
