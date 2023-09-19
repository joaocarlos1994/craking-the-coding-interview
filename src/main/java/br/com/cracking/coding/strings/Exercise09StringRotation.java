package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

public class Exercise09StringRotation {

    public static void main(String[] args) {
        Exercise09StringRotation exercise08ZeroMatrix = new Exercise09StringRotation();
        boolean rotateString = exercise08ZeroMatrix.isRotateString("abcde", "cdeab");
        Assertions.assertTrue(rotateString);
    }

    public boolean isRotateString(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            String s1s1 = s1 + s1;
            return s1s1.contains(s2);
        }
        return false;
    }
}
