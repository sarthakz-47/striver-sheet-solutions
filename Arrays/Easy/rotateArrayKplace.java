package Arrays.Easy;

public class rotateArrayKplace {

      public static void reverse(int nums[], int low, int high) {
            while (low < high) {
                  int temp = nums[low];
                  nums[low] = nums[high];
                  nums[high] = temp;
                  low++;
                  high--;
            }
      }

      // Left Rotate: Approach - O(n)
      // 1.Rotate from 0 to k elements , first k elements
      // 2.Rotate from k to n elements, next reamining elements
      // 3.Rotate entire array.

      public static int[] leftRotateArrayByKPlaces(int nums[], int k) {
            int n = nums.length;
            k = k % n; // When k>n

            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
            reverse(nums, 0, n - 1);

            return nums;
      }

      // Right Rotate : Approach - O(n)
      // 1. reverse whole array
      // 2. reverse first 0 to k elements
      // 3. revrese last k to n-1 elements

      public static int[] rightRotateArrayByKPlaces(int nums[], int k) {
            int n = nums.length;
            k = k % n; // When k>n

            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);

            return nums;
      }

      public static void main(String args[]) {
            int arr[] = { 1, 2, 3, 4, 5 };
            int k = 2;

            rightRotateArrayByKPlaces(arr, k);
            for (int nums : arr) {
                  System.out.print(nums + " ");
            }
      }
}
