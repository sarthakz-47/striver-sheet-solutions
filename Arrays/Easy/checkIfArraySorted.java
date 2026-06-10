public class checkIfArraySorted {

      public static boolean isSorted(int[] arr) {
            // Approach: O(n)
            // 1.start with 0th idx then comapre it with adjacant idx [i+1]
            // 2.if arr[i] > arr[i+1] -> not sorted return false
            // 3.else return true
            // 4.reapeat.

            if (arr.length == 0 || arr.length == 1) {
                  return true;
            }

            for (int i = 0; i < arr.length - 1; i++) {
                  if (arr[i] > arr[i + 1]) {
                        return false;
                  }
            }

            return true;
      }

      public static void main(String[] args) {
            int arr[] = { 1, 3, 2 };
            System.out.println(isSorted(arr));
      }
}
