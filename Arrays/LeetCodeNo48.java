import java.util.Arrays;
public class LeetCodeNo48{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
    }
    static void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] matrix1 : matrix) {
            int start = 0;
            int end = matrix1.length - 1;
            while (start<=end) {
                int temp = matrix1[start];
                matrix1[start] = matrix1[end];
                matrix1[end] = temp;
                start++;
                end--;
            }
        }
    }
}