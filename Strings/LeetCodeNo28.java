public class LeetCodeNo28 {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}