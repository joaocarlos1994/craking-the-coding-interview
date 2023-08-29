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
        int j = minDistance("intention", "execution");
        int k = minDistance("ab", "a");
        Assertions.assertEquals(3, i);
        Assertions.assertEquals(5, j);
        Assertions.assertEquals(1, k);
    }

    public static int minDistance(String word1, String word2) {
        int[][] result = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            result[i][0] = i;
        }

        for (int i = 0; i <= word2.length(); i++) {
            result[0][i] = i;
        }

        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j < result[i].length; j++) {
                char letterWord1 = word1.charAt(i - 1);
                char letterWord2 = word2.charAt(j - 1);

                int value1 = result[i -1][j];
                int value2 = result[i -1][j - 1];
                int value3 = result[i][j -1];

                int resultValue = Math.min(value3, Math.min(value1, value2));
                if (letterWord1 == letterWord2) {
                    result[i][j] =  result[i - 1][j - 1];
                } else {
                    result[i][j] = resultValue + 1;
                }
            }
        }
        return result[word1.length()][word2.length()];
    }
}
