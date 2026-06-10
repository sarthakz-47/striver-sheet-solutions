public class removeDuplicates {

      public static int removeDuplicatesSorted(int[] arr) {
            // Two Pointers Approach:
            // 1. set i to 0 play with index
            // 2. iterate from 1st index to last idx
            // 3. if arr[j] == arr[i] -> skip
            // 4. if not -> unique -> then push that arr[j] to arr[i+1] idx
            // 5. increment the ith idx also
            // 6. reapeat.

            int i = 0;
            for (int j = 1; j < arr.length; j++) {
                  if (arr[i] != arr[j]) {
                        arr[i + 1] = arr[j];
                        i++;
                  }
            }
            return i + 1;
      }

      public static void main(String[] args) {
            int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
            System.out.println(removeDuplicatesSorted(arr));
      }
}
