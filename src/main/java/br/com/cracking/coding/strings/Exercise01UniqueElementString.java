package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

public class Exercise01UniqueElementString {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     * */

    public static void main(String[] args) {
        Assertions.assertTrue(isUnique("ZGABC"));
        Assertions.assertFalse(isUnique("ZGABCA"));
    }

    public static boolean isUnique(final String word) {
        if (word.length() > 128) {
            return false;
        }

        final boolean[] uniques = new boolean[128];
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (uniques[letter]) {
                return false;
            }
            uniques[letter] = true;
        }
        return true;
    }
}
