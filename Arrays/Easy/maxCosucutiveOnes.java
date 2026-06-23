package Arrays.Easy;

public class maxCosucutiveOnes {
      public static int findMaxConsecutiveOnes(int[] nums) {

            // Approach:O(n)
            // 1.keep count 0 and maintain max = 0 for max found till ith element
            // 2.traverse and if currEle == 1 then increase count and update max
            // 3. if currEle == 0 then make count = 0 and start with next index

            int count = 0;
            int n = nums.length;
            int max = 0;

            for (int i = 0; i < n; i++) {
                  if (nums[i] == 1) {
                        count++;
                        max = Math.max(max, count);
                  } else {
                        count = 0;
                  }
            }
            return max;
      }

      public static void main(String[] args) {
            int arr[] = { 1, 0, 1, 1, 0, 1 };
            int res = findMaxConsecutiveOnes(arr);
            System.out.println(res);
      }

}
