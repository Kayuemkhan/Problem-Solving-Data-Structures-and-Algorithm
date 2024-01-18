package oj_solve;

public class SetMatrixZeroes_73 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }

    private static void setZeroes(int[][] matrix) {
        int k =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]==0){
                    k=j;
                    return;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i+1 == k){

                }
            }
        }
    }
}
