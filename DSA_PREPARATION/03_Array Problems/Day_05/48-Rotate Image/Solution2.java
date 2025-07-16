class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swapTranspose(i, j, matrix);
            }
        }
        for (int i = 0; i < n; i++) {
            reverseRow(i, matrix);
        }
    }

    void reverseRow(int row, int[][] matrix) {
        int left = 0;
        int right = matrix[row].length - 1;
        while (left < right) {
            swapRow(left, right, row, matrix);
            left++;
            right--;
        }
    }

    void swapTranspose(int i, int j, int[][] matrix) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    void swapRow(int left, int right, int row, int[][] matrix) {
        int temp = matrix[row][left];
        matrix[row][left] = matrix[row][right];
        matrix[row][right] = temp;
    }

}
