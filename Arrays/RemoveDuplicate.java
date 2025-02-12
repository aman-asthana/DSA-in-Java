import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        System.out.println(removeDuplicate(arr));
    }
    static ArrayList<Integer> removeDuplicate(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
