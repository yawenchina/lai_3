public class Solution {
    public int[][] generateMatrix(int n) {
        if(n <= 0){
            return new int[n][n];
        }
        int[][] matrix = new int[n][n];
        int size = n;
        int offset = 0;
        int number = 1;
        while(size >0){
            if( size == 1){
                matrix[offset][offset] = number++;
                break;
            }
            for(int i = 0; i < size-1;i++){
                matrix[offset][offset+i] = number++;
            }
            for(int i = 0; i < size-1;i++){
                matrix[offset+i][n-1-offset] = number++;
            }
            for(int i = 0; i < size-1;i++){
                matrix[n-1-offset][n-1-offset-i] = number++;
            }
            for(int i = 0; i < size-1;i++){
                matrix[n-1-offset-i][offset] = number++;
            }
            
            offset++;
            size = size-2;
            
        }
        return matrix;
    }
}