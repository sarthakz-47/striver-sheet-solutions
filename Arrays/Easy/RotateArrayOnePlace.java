package Arrays.Easy;

public class RotateArrayOnePlace {
      public static int[] leftRotateArrayByOnePlace(int[] arr) {
            // Approach: O(n)
            // 1.store the first element which has to be shifted to the end in tmep
            // 2.move every elemenet from 1 to n-1 to prev index
            // 3.at last assign that temp to last idx
            // 4.reapeat.
            int n = arr.length;
            int temp = arr[0];
            for (int i = 1; i < n; i++) {
                  arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;
            return arr;
      }

      public static int[] rightRotateArrayByOnePlace(int[] arr) {
            // Approach: O(n)
            // 1.store the first element which has to be shifted to the end in tmep
            // 2.move every elemenet from 1 to n-1 to prev index
            // 3.at last assign that temp to last idx
            // 4.reapeat.
            int n = arr.length;
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                  arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            return arr;
      }

      public static void main(String[] args) {
            int nums[] = { 1, 2, 3, 4, 5 };
            // leftRotateArrayByOnePlace(nums);
            rightRotateArrayByOnePlace(nums);
            for (int x : nums) {
                  System.out.print(x + " ");
            }
      }
}
