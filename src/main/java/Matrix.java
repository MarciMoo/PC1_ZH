import java.util.ArrayList;

public class Matrix {
    public Matrix() {
    }

    public static int countNumbersDivisibleBySeven(int[][] matrix) {
        int x = 0;
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix.length; j++ ) {
                if(matrix[i][j] % 7 == 0){
                    x++;
                }
            }
        }
        return x;
    }

    public static ArrayList<Integer> columnsWithMax(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = 0, c = 0;
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix.length; j++ ) {
                if(matrix[j][i] >= m){
                    m = matrix[j][i];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix.length; j++ ) {
                if(matrix[j][i] == m){
                    result.add(j);
                }
            }
        }
        return result;
    }
}
