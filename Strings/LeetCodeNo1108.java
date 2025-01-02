public class LeetCodeNo1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";

        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char[] ch = address.toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(ch[i] >= '0' && ch[i] <= '9'){
                sb.append(ch[i]);
            }
            if(ch[i] == '.'){
                sb.append("[");
                sb.append(ch[i]);
                sb.append("]");
            }
        }
        return sb.toString();
    }
}
