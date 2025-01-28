import java.util.Arrays;

public class LeetCodeNo242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t) {
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);
        if(sch.length != tch.length){
            return false;
        }
        for(int i = 0; i<sch.length; i++){
            if(sch[i]!=tch[i]){
                return false;
            }
        }
        return true;
    }
}
