package leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    //leetcode 1002
    class Solution {
        public List<String> commonChars(String[] words) {
            if(words.length == 1) {
                return words[0].chars()
                        .mapToObj(c -> String.valueOf((char)c))
                        .toList();
            }
            var result = new ArrayList<String>();
            int [][] container = new int[words.length][26];
            for(int i = 0; i < words.length; i++) {
                for(char ch: words[i].toCharArray()) {
                    container[i][ch-'a']++;
                }
            }
            var hash = new int[26];
            for(char ch: words[0].toCharArray()) {
                hash[ch-'a']++;
            }
            for(int i = 0; i < 26; i++) {
                int val = hash[i];
                if(val > 0) {
                    for(int j = 1; j < words.length; j++) {
                        val = Math.min(container[j][i], val);
                    }
                }
                while(val > 0) {
                    char k = (char)(i+'a');
                    result.add(String.valueOf(k));
                    val--;
                }
            }
            return result;
        }
    }
}
