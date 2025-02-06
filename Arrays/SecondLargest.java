public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(secondLarge(arr));
    }
    static int secondLarge(int[] arr){
        int large = arr[0];
        int secondLarge = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>large){
                secondLarge = large;
                large = arr[i];
            }
            if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
}