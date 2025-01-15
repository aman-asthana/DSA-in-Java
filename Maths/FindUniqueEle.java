public class FindUniqueEle {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int unique = 0;
        for(int i=0; i<arr.length; i++){
            unique = unique ^ arr[i];
        }
        return unique;
    }
}
