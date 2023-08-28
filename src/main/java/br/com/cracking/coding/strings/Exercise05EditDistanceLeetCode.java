package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;

/**
 * There are three types of edits that can be performed one string: insert a character, remove a
 * character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 */
public class Exercise05EditDistanceLeetCode {
    public static void main(String[] args) {
        int i = minDistance("horse", "ros");
        //int j = minDistance("intention", "execution");
        int k = minDistance("ab", "a");
        //Assertions.assertEquals(3, i);
        //Assertions.assertEquals(5, j);
        Assertions.assertEquals(1, k);
    }

    public static int minDistance(String word1, String word2) {
        final Map<Character, Integer> aux = new HashMap<>();
        for (int i = 0; i < word2.length(); i++) {
            char letter = word2.charAt(i);
            if (aux.containsKey(letter)) {
                int count = aux.get(letter);
                aux.put(letter, count++);
            } else {
                aux.put(letter, 1);
            }
        }

        int result = 0;
        int indexS2 = 0;
        for (int i = 0; i < word1.length(); i++) {
            char letter = word1.charAt(i);
            if (aux.containsKey(letter)) {
                char target = word2.charAt(indexS2);
                if (!(letter == target)) {
                    result++;
                }

                indexS2++;

                Integer countLetter = aux.get(letter);
                if (countLetter - 1 == 0) {
                    aux.remove(letter);
                } else {
                    aux.put(letter, countLetter--);
                }
            } else {
                result++;
            }
        }
        return result;
    }
}
