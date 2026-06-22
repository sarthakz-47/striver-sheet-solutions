package Arrays.Medium;

class Solution {

      public static void printSpiral(int[][] arr) {
            // Approch: O(n*m) pattern approach
            // 1.four pointers top,bottom,left,right
            // 2.print top then move top downwards
            // 3.print right then move inwards
            // 4.print bottom then move upwards
            // 5.print left then move inwards

            int n = arr.length;
            int m = arr[0].length;

            int left = 0;
            int right = n - 1;
            int top = 0;
            int bottom = m - 1;

            while (left <= right && top <= bottom) {
                  for (int i = left; i <= right; i++) {
                        System.out.print(arr[top][i]);
                  }
                  top++;

                  for (int i = top; i <= bottom; i++) {
                        System.out.print(arr[i][right]);
                  }
                  right--;

                  if (top <= bottom) {
                        for (int i = right; i >= left; i--) {
                              System.out.print(arr[bottom][i]);
                        }
                        bottom--;
                  }

                  if (left <= right) {
                        for (int i = bottom; i >= top; i--) {
                              System.out.print(arr[i][left]);
                        }
                        left++;
                  }
            }

      }

      public static void main(String[] args) {
            int arr[][] = { { 1, 2, 3 },
                        { 5, 6, 7 },
                        { 7, 8, 9, }
            };
            printSpiral(arr);
      }
}
