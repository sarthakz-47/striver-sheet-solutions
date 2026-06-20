package Strings;

public class rotateString {

      public static boolean rotateStrings(String s, String goal) {
            // Approach: Brute Force
            // 1.Strings must be same length to be rotations of each other
            // 2.Try all possible rotations of 's'
            // 3.For each rotated version of the string, compare it with the goal string.
            // 4.If a match is found at any point, return true immediately as the goal can
            // be achieved.
            // 5.If none of the rotations match the goal string after checking all
            // possibilities, return false.

            int n1 = s.length();
            int n2 = goal.length();
            if (n1 != n2) {
                  return false;
            }

            // for(int i=0;i<n1;i++){
            // String rotated = s.substring(i)+s.substring(0,i);
            // if(rotated.equals(s)){
            // return true;
            // }
            // }
            // return false;

            // Complexity: TC: O(N^2) since generating N rotations and each comparison takes
            // O(N) time.
            // SC: O(N) for the space needed to store each rotated string.

            // Approach: Optimized Approach
            // 1.Double the original string by joining it with itself, creating a new string
            // like s + s.
            // 2.Look for the target string goalinside this new doubled string using
            // contains() method.
            // 3.If goal exists within the doubled string, then it's a valid rotation,
            // return true.
            // 4.If it's not found, that means the original string cannot be rotated to
            // match goal, return false

            String doubled = s + s;
            boolean result = doubled.contains(goal);
            return result;

            // Complexity: TC: O(n) because checking for a substring in s + s is linear in
            // time.
            // SC: O(n) for the space needed to store the concatenated string s + s.
      }

      public static void main(String[] args) {
            String s = "hello";
            String goal = "lohel";
            System.out.println(rotateStrings(s, goal));
      }
}
