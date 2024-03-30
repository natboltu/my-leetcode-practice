package leetcodeproblems;

import java.util.Arrays;

public class LongestPalindrome {
    class Solution {
        public int longestPalindrome(String s) {
            if(s.length() == 1) {
                return s.length();
            }
            int []hash = new int[100];
            Arrays.fill(hash, 0);

            for(char c: s.toCharArray()) {
                hash[c-'A']++;
            }
            int ans = 0;
            int oddcount = 0;
            for(int i = 0; i<100; i++) {
                if(hash[i]%2 == 0) {
                    ans += hash[i];
                } else {
                    oddcount = 1;
                    if( hash[i] > 2) {
                        ans += (hash[i]-1);
                    }
                }
            }
            return ans+oddcount;
        }
    }
}
