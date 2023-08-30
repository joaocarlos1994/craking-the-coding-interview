package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

/**
 *
 * */
public class Exercise06StringCompression {
    public static void main(String[] args) {
        String a = "pale";
        String compress = compress(a);
        Assertions.assertEquals("pale", compress);
    }

    public static String compress(final String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0;  i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+ 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
