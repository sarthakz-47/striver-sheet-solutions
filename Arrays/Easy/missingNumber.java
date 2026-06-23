package Arrays.Easy;
// import java.util.*;

public class missingNumber {

      public static int findMissingNum(int[] arr) {

            // Approach: by me O(nlogn)
            // int n = arr.length;
            // Arrays.sort(arr);
            // for (int i = 0; i < n; i++) {
            // if (arr[i] != i + 1) {
            // return i + 1;
            // }
            // }
            // return -1;

            // Approch: Sum formula O(n)
            // 1.the missing num will be sum of all elements - curr sum of the array
            // 2.sum of all elements from 1 to n -> n(n+1)/2
            // 3.but consider n = n+1 because we are assuming 1 value is missing

            int n = arr.length + 1;
            int totalSum = (n * (n + 1)) / 2;
            int currSum = 0;

            for (int nums : arr) {
                  currSum += nums;
            }

            int res = totalSum - currSum;
            return res;

      }

      public static void main(String[] args) {
            int arr[] = { 8, 2, 4, 5, 3, 7, 1 };
            int res = findMissingNum(arr);
            System.out.println(res);
      }
}
