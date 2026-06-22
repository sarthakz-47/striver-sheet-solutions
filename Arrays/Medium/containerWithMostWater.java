package Arrays.Medium;

class Solution {
      public int maxArea(int[] arr) {
            // ** Approach: Brute Force
            // 1.Try for each pair of the line from start to end
            // 2.Calculate totalWater trapped by area = height * width
            // 3.For height get the min from left and right boundary
            // 4.For width it will be right - left boundary
            // 5.Compare for each pair and return maxArea

            // int maxWater = 0;
            // for(int i=0;i<height.length;i++){
            // for(int j=0;j<height.length;j++){
            // int ht = Math.min(height[i],height[j]);
            // int wd = j-i;
            // int currWater = ht * wd;
            // maxWater = Math.max(maxWater,currWater);
            // }
            // }
            // return maxWater;

            // Complexity: TC: O(N^2) due to first loop runs for n times while second loop
            // also runs for n times.
            // SC: O(1) no extra space used.

            // ** Approach: Two Pointers
            // 1.Place one pointer at the start and another at the end of the array.
            // 2.Calculate the current area.
            // 3.Update maxArea if the current area is greater.
            // 4.Move the pointer having the smaller height because:
            // - The area is limited by the smaller height.
            // - Moving the taller pointer cannot increase the height limit.
            // - Only moving the smaller pointer gives a chance to find a taller boundary.
            // 5.Repeat until both pointers meet.
            // 6.Return the maximum area found.

            int n = arr.length;
            int maxArea = 0;
            int start = 0;
            int end = n - 1;

            while (start < end) {
                  int ht = Math.min(arr[start], arr[end]);
                  int wd = end - start;
                  int currArea = ht * wd;
                  maxArea = Math.max(currArea, maxArea);

                  if (arr[end] > arr[start]) {
                        start++;
                  } else {
                        end--;
                  }
            }
            return maxArea;
            // Complexity: TC: O(N) because each pointer moves at most N times.
            // SC: O(1) because no extra space is used.
      }
}
