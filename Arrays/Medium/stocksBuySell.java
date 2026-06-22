package Arrays.Medium;

class Solution {
      public static int maxProfit(int[] prices) {
            int n = prices.length;
            int profit = 0;
            int maxProfit = 0;

            // 1. Brute Force O(n^2): try every buy day and every sell day after it O(n^2)
            // for(int i=0;i<n;i++){
            // for(int j=i+1;j<n;j++){
            // profit = prices[j] - prices[i];
            // maxProfit = Math.max(profit,maxProfit);
            // }
            // }
            // return maxProfit;

            // 2. Prfix Min array O(n) + O(n): Store the minimum stock price seen up to each
            // day
            // For every day:
            // Find minimum price before it.
            // Calculate profit = currentPrice - minPrice.

            // int prefix[] = new int[n];
            // prefix[0] = prices[0];
            // for(int i=1;i<prices.length;i++){
            // prefix[i] = Math.min(prices[i],prefix[i-1]);
            // }

            // for(int i=1;i<n;i++){
            // profit = prices[i] - prefix[i];
            // maxProfit = Math.max(profit,maxProfit);
            // }
            // return maxProfit;

            // 3.Greedy Approach O(n): To maximize profit:
            // Buy at the lowest price seen so far.
            // Sell at the current price.

            int minPrice = prices[0];
            for (int i = 1; i < n; i++) {
                  profit = prices[i] - minPrice;
                  maxProfit = Math.max(maxProfit, profit);
                  minPrice = Math.min(minPrice, prices[i]);
            }
            return maxProfit;
      }

      public static void main(String[] args) {
            int prices[] = { 7, 1, 2, 4, 6, 2 };
            System.out.println(maxProfit(prices));
      }
}
