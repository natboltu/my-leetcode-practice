package leetcodeproblems;

public class PalindromePermutation {
    class Solution {
        public boolean canPermutePalindrome(String s) {
            int[] mp = new int[26];
            for(char ch : s.toCharArray()) {
                mp[ch-'a']++;
            }

            int count = 0;
            for(int i = 0; i<26; i++) {
                if(mp[i] % 2 != 0) {
                    count++;
                }
                if(count > 1) {
                    return false;
                }
            }
            return true;
        }
    }
}
