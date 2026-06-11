class bubbleSort {

      public static void sortBubble(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                  for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                              int temp = arr[j];
                              arr[j] = arr[j + 1];
                              arr[j + 1] = temp;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            int arr[] = { 2, 4, 1, 5, 9, 6 };
            sortBubble(arr);
            for (int nums : arr) {
                  System.out.print(nums + " ");
            }
      }
}

// Bubble Sort
// Idea: Compare adjacent elements and swap if they are in the wrong order.
// Biggest element "bubbles" to the end.

// Initial: {3, 2, 1}
// Compare 3 and 2 → swap → {2, 3, 1}
// Compare 3 and 1 → swap → {2, 1, 3}

// Next pass:
// Compare 2 and 1 → swap → {1, 2, 3}

// For decending:
// just update from arr[j] > arr[j + 1] -> arr[j] < arr[j + 1]