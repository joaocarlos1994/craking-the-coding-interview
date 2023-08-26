package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class Exercise04PalindromePermutation {

    /**
     * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome
     * is a word or phrase that is the same forwards and backwards. A permutation in a rearrangement of
     * letters. The palindrome does not need to be limited to just dictionary words.
     * */

    public static void main(String[] args) {
        String word = "Tact Coa";
        String word2 = "tactcoapapa";
        Assertions.assertEquals(true, isPalindromePermutation(word));
        Assertions.assertEquals(true, isPalindromePermutation(word2));
    }

    public static boolean isPalindromePermutation(final String word) {
        Map<String, Integer> aux = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!Character.isLetter(letter)) {
                continue;
            }

            String letterAsString = Character.toString(letter).toLowerCase();
            if (aux.containsKey(letterAsString)) {
                Integer totalLetter = aux.get(letterAsString);
                totalLetter+= 1;
                aux.put(letterAsString, totalLetter);
            } else {
                aux.put(letterAsString, 1);
            }
        }

        boolean notPalindrome = false;
        for (String character : aux.keySet()) {
            if (!(aux.get(character) % 2 == 0)) {
                if (notPalindrome) {
                    return false;
                }
                notPalindrome = true;
            }
        }
        return true;
    }
}
