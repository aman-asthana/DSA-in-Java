public class LeetCodeNo1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        for(int i = 'a'; i <= 'z'; i++){
            if(sentence.indexOf(i)==-1){
                return false;
            }
        }
    return true;
    }
}
