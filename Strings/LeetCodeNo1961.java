public class LeetCodeNo1961 {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s, words));
    }
    static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String str : words){
            sb.append(str);
            if(s.length()==sb.toString().length()){
                break;
            }
        }

        return s.equals(sb.toString());
    }
}
