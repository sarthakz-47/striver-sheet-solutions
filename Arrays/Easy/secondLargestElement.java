package Arrays.Easy;

class Solution {
	public static int secondLargest(int nums[]) {
		// Approach: O(n)
		// 1.Assume and comapre first two elements of array and find max1 and max2
		// 2.Loop from 2->n and chek if curr>max1? first update max2 then max1 : update
		// max2 only
		// 3.Return max2.

		int max1, max2;
		if (nums[0] > nums[1]) {
			max1 = nums[0];
			max2 = nums[1];
		} else {
			max1 = nums[1];
			max2 = nums[0];
		}

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] > max1) {
				max2 = max1;
				max1 = nums[i];
			} else if (nums[i] > max2 && nums[i] != max1) {
				max2 = nums[i];
			}
		}
		return max2;
	}

	public static void main(String args[]) {
		int nums[] = { 1, 2, 3, 4, 2, 1, 10 };
		System.out.println(secondLargest(nums));
	}
}