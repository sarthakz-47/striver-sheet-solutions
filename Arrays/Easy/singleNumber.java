package Arrays.Easy;

public class singleNumber {

      public static int findSingleNum(int[] arr) {

            // Approach: O(n^2)
            // Go throght each elements by two pointers and check if they are same or not
            // if yes then count++ else dont do anything
            // check if the count == 1 means single element then return that element

            // int n = arr.length;
            // int count = 0;

            // for(int i=0;i<n;i++){
            // count = 0;
            // for(int j=0;j<n;j++){
            // if(arr[i] == arr[j]){
            // count++;
            // }
            // }

            // if(count==1){
            // return arr[i];
            // }
            // }
            // return -1;

            // Approach: XOR opration O(n)
            // 1. let var = 0 for xor with arr[i]
            // 2. traverse though array and perform x ^ arr[i]
            // 3. after condtn ends it will give the single element
            // 4. dry run!

            int n = arr.length;
            int x = 0;

            for (int i = 0; i < n; i++) {
                  x = x ^ arr[i];
            }
            return x;
      }

      public static void main(String[] args) {
            int arr[] = { 2, 2, 1, 1, 3 };
            int res = findSingleNum(arr);
            System.out.println(res);
      }
}