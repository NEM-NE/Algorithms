package ch1;

public class Exercise13 {
    //2차원 배열의 행과 열을 바꾸는 코드를 작성해라  예) 가열 나행 => 나열 가행
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 } };
        rotate(mat);
    }

    static int[][] rotate(int[][] matrix){
        int [][] newMat = new int [matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[i].length; j++){
                newMat[j][i] = matrix[i][j];
            }
        }
        return matrix;
    }
}
