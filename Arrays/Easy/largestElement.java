class Solution {
	public static int largestElement(int[] nums) {
		// Approach: O(n)
		// 1.Let the first element of array be largest.
		// 2.Iterate through array and find next largest element than assumed one

		int largest = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (largest < nums[i]) {
				largest = nums[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		System.out.println(largestElement(nums));
	}
}