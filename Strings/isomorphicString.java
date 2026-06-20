package Strings;

public class isomorphicString {
      public static boolean isIsomorphic(String s, String t) {
            // Approach: Optimal approch
            // 1.Use two fixed-size arrays (size 256) to track the last-seen positions of
            // characters from each string.
            // 2.While scanning both strings together, compare if the characters at the
            // current position have been seen at the same relative positions before.
            // 3.If not, it indicates inconsistent mapping — one character maps to multiple
            // others — return false.
            // 4.If consistent, update the last seen position of both characters to ensure
            // future checks remain valid.

            int[] m1 = new int[256];
            int[] m2 = new int[256];

            for (int i = 0; i < s.length(); i++) {
                  char c1 = s.charAt(i);
                  char c2 = t.charAt(i);

                  if (m1[c1] != m2[c2]) {
                        return false;
                  }

                  m1[s.charAt(i)] = i + 1;
                  m2[t.charAt(i)] = i + 1;
            }

            return true;

            // Complexity: TC: O(N) single loop for traversing
            // SC: O(1) 2 new arrays but const size
      }

      public static void main(String[] args) {
            String s = "fool";
            String t = "gaab";

            // String s = "f11";
            // String t = "b23";

            System.out.println(isIsomorphic(s, t));
      }
}
