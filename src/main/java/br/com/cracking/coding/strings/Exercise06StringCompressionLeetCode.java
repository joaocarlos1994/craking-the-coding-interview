package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

/**
 *
 * {@link <a href="https://leetcode.com/problems/string-compression/description/">String Compress</a>}
 * */
public class Exercise06StringCompressionLeetCode {
    public static void main(String[] args) {
        String a = "pale";
        int compress = compress(a.toCharArray());
        Assertions.assertEquals("pale", new String(a.toCharArray()).substring(0, compress));
    }

    public static int compress(char[] chars) {
        final StringBuilder letters = new StringBuilder();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char letter = chars[i];
            if (letters.isEmpty()) {
                letters.append(letter);
                count++;
                continue;
            }

            String actualWord = letters.toString();
            if (actualWord.charAt(actualWord.length() - 1) == letter) {
                count++;
                if (i == chars.length - 1 && count > 1) {
                    letters.append(count);
                }
            } else {
                if (count > 1) {
                    letters.append(count);
                }
                count = 1;
                letters.append(letter);
            }
        }
        for (int i = 0; i < letters.length(); i++) {
            chars[i] = letters.charAt(i);
        }
        return letters.length();
    }
}
