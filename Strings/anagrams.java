package Strings;

public class anagrams {
      public static boolean checkAnagramBF(String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();

            if (n1 != n2) {
                  return false;
            }

            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            java.util.Arrays.sort(charArray1);
            java.util.Arrays.sort(charArray2);

            for (int i = 0; i < n1; i++) {
                  if (charArray1[i] != charArray2[i]) {
                        return false;
                  }
            }
            return true;
      }

      public static boolean checkAnagramOP(String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();

            if (n1 != n2) {
                  return false;
            }

            int[] freq = new int[26];

            for (int i = 0; i < n1; i++) {
                  freq[s1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < n2; i++) {
                  freq[s2.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                  if (freq[i] != 0) {
                        return false;
                  }
            }
            return true;
      }

      public static void main(String[] args) {
            String s10 = "race";
            String s11 = "care";

            System.out.println(checkAnagramBF(s10, s11));
            System.out.println(checkAnagramOP(s10, s11));
      }
}
