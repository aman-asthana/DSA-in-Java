

public class LeetCodeNo268 {
    public static void main(String[] args) {
        int[] arr = {0,1};
        
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){               
                arr[i] = arr[i] ^ arr[correct];
                arr[correct] = arr[i] ^ arr[correct];
                arr[i] = arr[i] ^ arr[correct];
            }else{                
                i++;
            }
        }        
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] != idx){
                return idx;
            }
        }
        return arr.length;
    }
}
