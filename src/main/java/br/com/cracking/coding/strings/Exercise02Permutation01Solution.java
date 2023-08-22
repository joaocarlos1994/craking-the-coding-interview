package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;

public class Exercise02Permutation01Solution {

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
        char[] s1CharArray = s1.toCharArray();
        Arrays.sort(s1CharArray);
        char[] s2CharArray = s2.toCharArray();
        Arrays.sort(s2CharArray);
        return new String(s1CharArray).equals(new String(s2CharArray));
    }
}
