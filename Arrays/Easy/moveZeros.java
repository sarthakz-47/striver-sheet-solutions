public class moveZeros {
      public static void moveZerosEnd(int nums[]) {
            // Approach: Two pointers -> O(n)
            // 1.intitalzie a pointer to track the zeros
            // 2.run a loop from 0->n and check if a[j] is 0 or not
            // 3.if not zero then swap with i'th element
            // 4.increament i also.

            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                  if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        i++;
                  }
            }
      }

      public static void main(String[] args) {
            int nums[] = { 0, 1, 0, 3, 12 };
            moveZerosEnd(nums);
            for (int x : nums) {
                  System.out.print(x + " ");
            }
      }
}
