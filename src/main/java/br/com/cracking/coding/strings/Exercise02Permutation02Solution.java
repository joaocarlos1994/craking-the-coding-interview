package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Exercise02Permutation02Solution {

    /**
     * Permutation: Given two strings, write a method to decide if one is permutation of the other
     * */

    public static void main(String[] args) {
        Assertions.assertTrue(permutation("ABC", "CBA"));
        Assertions.assertFalse(permutation("ABC", "CBD"));

    }

    public static boolean permutation(final String s1, final String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int [] values = new int[128];
        for(int i = 0; i < s1.length(); i++) {
            values[s1.charAt(i)] = values[s1.charAt(i)] + 1;
        }

        for(int i = 0; i < s2.length(); i++) {
            values[s2.charAt(i)] = values[s2.charAt(i)] - 1;
            if (values[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}
