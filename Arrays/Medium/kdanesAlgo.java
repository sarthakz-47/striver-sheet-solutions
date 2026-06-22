package Arrays.Medium;

class Soltuion {
      public static int maxSubArray(int[] nums) {
            int cs = 0;
            int ms = Integer.MIN_VALUE;
            // 1. brute force: using three loops O(n^3)
            // for(int i=0;i<nums.length;i++){
            // for(int j=i;j<nums.length;j++){
            // cs = 0;
            // for(int k=i;k<=j;k++){
            // cs+= nums[i];
            // }
            // ms = Math.max(cs,ms);
            // }
            // }
            // return ms;

            // 2. Prefix Array: using two loops o(n^2) but extra space O(n)
            // int prefix[] = new int[nums.length];
            // prefix[0]=nums[0];
            // for(int i=1;i<nums.length;i++){
            // prefix[i] = nums[i] + prefix[i-1];
            // }

            // for(int i=0;i<nums.length;i++){
            // for(int j=i;j<nums.length;j++){
            // if(i==0){
            // cs = prefix[j];
            // }else{
            // cs = prefix[j] - prefix[i-1];
            // }
            // ms=Math.max(ms,cs);
            // }
            // }
            // return ms;

            // 3. Kdane's Algo: uses no extra space + O(n) TC
            for (int i = 0; i < nums.length; i++) {
                  cs += nums[i];
                  ms = Math.max(cs, ms);
                  if (cs < 0) {
                        cs = 0;
                  }
            }
            return ms;
      }

      public static void main(String[] args) {
            int nums[] = { -1, -2, -3 };
            int result = maxSubArray(nums);
            System.out.println(result);
      }
}