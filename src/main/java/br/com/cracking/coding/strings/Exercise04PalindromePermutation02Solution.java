package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class Exercise04PalindromePermutation02Solution {

    /**
     * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome
     * is a word or phrase that is the same forwards and backwards. A permutation in a rearrangement of
     * letters. The palindrome does not need to be limited to just dictionary words.
     * */

    public static void main(String[] args) {
        String[] strings = {"Rats live on no evil star",
                "A man, a plan, a canal, panama",
                "Lleve",
                "Tacotac",
                "asda"};
        for (String s : strings) {
            boolean a = isPalindromePermutation(s);
            boolean b = isPalindromePermutation(s);
            boolean c = isPalindromePermutation(s);
            System.out.println(s);
            if (a == b && b == c) {
                System.out.println("Agree: " + a);
            } else {
                System.out.println("Disagree: " + a + ", " + b + ", " + c);
            }
            System.out.println();
        }
    }

    public static boolean isPalindromePermutation(final String word) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') -
                             Character.getNumericValue('a') + 1];

        for (final char c : word.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    private static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }
}
