package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Exercise02Permutation03LeetCode {

    /**
     * Permutation: Given two strings, write a method to decide if one is permutation of the other
     * <{@link <a href="https://leetcode.com/problems/permutation-in-string/description/">...</a>}
     * */

    public static void main(String[] args) {
        Assertions.assertTrue(checkInclusion("ab", "eidbaooo"));
        Assertions.assertFalse(checkInclusion("adc", "dcda"));

    }

    public static boolean checkInclusion(String s1, String s2) {
        char[] s1Letters = s1.toCharArray();
        Arrays.sort(s1Letters);
        String auxS1 = new String(s1Letters);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String subAuxs2 = s2.substring(i, s1.length() + i);
            char[] s2Letters = subAuxs2.toCharArray();
            Arrays.sort(s2Letters);
            String auxS2 = new String(s2Letters);
            if (auxS1.equals(auxS2)) {
                return true;
            }
        }
        return false;
    }
}
