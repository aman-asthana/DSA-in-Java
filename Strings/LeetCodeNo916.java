import java.util.ArrayList;
import java.util.List;

public class LeetCodeNo916 {
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        System.out.println(wordSubsets(words1, words2));
    }
    static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        
        int[] target = new int[26];
        
        for(String b:words2){
            int[] temp=new int[26];
            
            for(char c:b.toCharArray()){
                temp[c-'a']++;
                target[c-'a'] = Math.max(target[c-'a'],temp[c-'a']);
            }
        }
        
        for(String a:words1){
            int[] arr=new int[26];
            
            for(char c:a.toCharArray()) arr[c-'a']++;
            
            if(subset(arr,target)){
                result.add(a);
            }
        }
        
        return result;
    }
    
    static boolean subset(int[] source,int[] dest){
        for(int i=0;i<26;i++){
            if(dest[i]>source[i]) return false;
        }
        return true;
    }

    
}
