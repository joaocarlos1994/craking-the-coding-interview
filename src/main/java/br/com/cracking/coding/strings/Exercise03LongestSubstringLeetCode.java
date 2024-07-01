package br.com.cracking.coding.strings;

import java.util.HashSet;
import java.util.Set;

public class Exercise03LongestSubstringLeetCode {

    public static void main(String[] args) {
        int abcabcbb = lengthOfLongestSubstring("abcabcbb");
    }

    public static int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        int leftIndex = 0;
        Set<Character> letters = new HashSet<>();
        for (char c : s.toCharArray()) {
            while (letters.contains(c)) {
                letters.remove(s.charAt(leftIndex));
                leftIndex += 1;
            }
            letters.add(c);
            longestSubstring = Math.max(longestSubstring, letters.size());
        }
        return longestSubstring;
    }

}
