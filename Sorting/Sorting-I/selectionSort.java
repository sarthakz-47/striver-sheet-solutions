public class selectionSort {

      public static void sortSelection(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                  int minIdx = i;
                  for (int j = i + 1; j < n; j++) {
                        if (arr[minIdx] > arr[j]) {
                              minIdx = j;
                        }
                  }

                  int temp = arr[i];
                  arr[i] = arr[minIdx];
                  arr[minIdx] = temp;
            }
      }

      public static void main(String[] args) {
            int arr[] = { 1, 7, 3, 2, 11 };
            sortSelection(arr);
            for (int nums : arr) {
                  System.out.print(nums + " ");
            }
      }

}

// Idea: Find the smallest element and place it at the beginning.

// Initial: {3, 2, 1}

// Smallest is 1 (index 2) store idx not value
// Swap with first element → {1, 2, 3}

// For decending:
// just update from arr[minIdx] > arr[j] -> arr[minIdx] < arr[j]