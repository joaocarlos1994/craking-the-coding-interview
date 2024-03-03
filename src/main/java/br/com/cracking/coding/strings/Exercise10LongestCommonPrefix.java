package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

public class Exercise10LongestCommonPrefix {

    public static void main(String[] args) {
        Exercise10LongestCommonPrefix exercise08ZeroMatrix = new Exercise10LongestCommonPrefix();

        String[] values = {"flower", "flow", "flight"};
        String prefix = exercise08ZeroMatrix.longestCommonPrefix(values);

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
