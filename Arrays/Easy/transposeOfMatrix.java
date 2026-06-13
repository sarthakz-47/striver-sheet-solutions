public class transposeOfMatrix {
      public static int[][] transpose(int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;

            // Approach: O(n*m) + O(n*m)
            // 1.swap rows<->col simple
            // 2.create a new matrix with size a[col][row]
            // 3.traverse through og array and assign
            // currEle = a[row][col] to ans[col][row] to transpose

            int[][] ans = new int[m][n];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        ans[j][i] = mat[i][j];
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
            int[][] result = transpose(arr);
            for (int[] row : result) {
                  for (int num : row) {
                        System.out.print(num + " ");
                  }
                  System.out.println();
            }
      }
}
