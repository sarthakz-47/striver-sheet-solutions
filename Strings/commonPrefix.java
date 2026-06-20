package Strings;

import java.util.Arrays;

public class commonPrefix {
      public static String longestCommonPrefix(String[] strs) {
            // Approach: Sorting Approach:
            // 1.The common prefix across all strings must exist between the smallest and
            // largest string when sorted lexicographically-> Sort the array
            // 2.Sorting the array helps bring these boundary strings to the extremes.
            // 3.By comparing only the first and last strings, we can determine the full
            // common prefix shared by the entire array-> get first and last strings from
            // the array
            // 4.Character-wise comparison from the beginning allows us to identify where
            // the prefix stops-> if fisr.charAt(i) == last.charAt(i) i++
            // 5.The portion before this mismatch is the longest common prefix among all
            // strings-> fisrt.substring(0,i)

            if (strs == null || strs.length == 0) {
                  return "";
            }

            Arrays.sort(strs);

            String first = strs[0];
            String last = strs[strs.length - 1];

            int i = 0;
            while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
                  i++;
            }

            return first.substring(0, i);
      }

      public static void main(String[] args) {
            String[] strs = { "flower", "flow", "flight" };
            // String[] strs = { "dog", "racecar", "car" };
            System.out.println(longestCommonPrefix(strs));
      }
}
