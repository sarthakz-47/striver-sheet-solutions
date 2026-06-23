package Arrays.Easy;

public class digonalSum {
      public static int matrixDiagonalSum(int[][] mat) {
            int n = mat.length;
            int sum = 0;

            // // Brute Force Approach: O(n)
            // for(int i=0;i<n;i++){
            // for(int j=0;j<n;j++){
            // if(i==j){
            // sum+=mat[i][j];
            // }else if((i+j)==n-1 && i!=j){
            // sum+=mat[i][j];
            // }
            // }
            // }

            for (int i = 0; i < n; i++) {
                  sum += mat[i][i];
                  sum += mat[i][n - 1 - i];
            }

            if (n % 2 == 1) {
                  sum -= mat[n / 2][n / 2];
            }

            return sum;
      }

      public static void main(String[] args) {
            int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            System.out.println(matrixDiagonalSum(arr));
      }
}
