package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

import java.util.Map;

/**
 * There are three types of edits that can be performed one string: insert a character, remove a
 * character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 *
 * */
public class Exercise05OneWay {
    public static void main(String[] args) {
        String a = "pale";
        String b = "ple";
        boolean isOneEdit = oneEditAway(a, b);
        Assertions.assertTrue(isOneEdit);
    }

    public static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (second.length() + 1 == first.length()) {
            return oneEditInsert(second, first);
        }
        return false;
    }

    static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
