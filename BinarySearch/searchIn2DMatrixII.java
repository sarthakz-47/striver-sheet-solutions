public class searchIn2DMatrixII {

      public static boolean search(int[][] arr, int target) {
            int n = arr.length;
            int m = arr[0].length;

            // Approach: O(n^2)
            // 1.travrse through each row and each col
            // 2.if element fount at a[i][j] then return true;

            // for(int i=0;i<n;i++){
            // for(int j=0;j<m;j++){
            // if(matrix[i][j]==target){
            // return true;
            // }
            // }
            // }
            // return false;

            // Approach: O(m+n)
            // 1.get topmost+rightmost elemnt
            // 2.compare that element with target
            // 3.if element = target ->true
            // 4.if element>target means go left -> col--
            // 5.when element<target means go down -> row++
            // 6.till when? untill rows goes beyond ending rows and
            // colms beyond 0 hence row<n && col>=0

            int row = 0;
            int col = m - 1;

            while (row < n && col >= 0) {
                  if (arr[row][col] == target) {
                        return true;
                  } else if (arr[row][col] > target) {
                        col--;
                  } else {
                        row++;
                  }
            }
            return false;
      }

      public static void main(String[] args) {
            int arr[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                        { 18, 21, 23, 26, 30 } };
            int target = 5;
            System.out.print(search(arr, target));
      }
}