package leetcodeproblems;

import java.util.Arrays;

// 5 : leetcode Longest common substring
public class LongestCommonSubstring {
    class Solution {
        String result = "";
        int maxLen = 0;
        public String longestPalindrome(String s) {
            int [][] isPalin = new int[s.length()][s.length()];
            for(int i=0; i< isPalin.length; i++){
                Arrays.fill(isPalin[i], 0); // not covered yet
            }

            for(int i =0; i < s.length(); i++) {
                isPalin[i][i] = 1;
            }
            for(int i = 0; i < s.length(); i++) {
                findMaxPalindromSubstring(isPalin, i, s.length() -1, s);
                findMaxPalindromSubstring(isPalin, 0, s.length()-1-i, s);
            }
            return "".equals(result) ? s.charAt(0) +"" : result;
        }

        int findMaxPalindromSubstring(int[][] isPalin, int i, int j, String s) {
            if(i == j) {
                return 1;
            }
            if(i< 0 || j < 0 || i > j || i >= s.length() || j >= s.length()) {
                return 0;
            }
            if(isPalin[i][j] != 0) {
                return isPalin[i][j];
            }

            if(s.charAt(i) == s.charAt(j)) {
                if(i==j-1) {
                    isPalin[i][j] = 1;
                } else {
                    isPalin[i][j] = findMaxPalindromSubstring(isPalin, i+1, j-1, s);
                }
                int len = j-i+1;
                if(isPalin[i][j] == 1 && len > maxLen) {
                    maxLen = len;
                    result = s.substring(i, j+1);
                }
            } else {
                isPalin[i][j] = 2;
                findMaxPalindromSubstring(isPalin, i, j-1, s);
                findMaxPalindromSubstring(isPalin, i+1, j, s);
            }
            return isPalin[i][j];
        }
    }
}
