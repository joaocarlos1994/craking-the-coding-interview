package br.com.cracking.coding.strings;

import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class Exercise01UniqueElementNumber {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     *
     * <a href="https://leetcode.com/problems/contains-duplicate/">Leetcode</a>
     * */

    public static void main(String[] args) {
        Assertions.assertTrue(isUnique(new int[]{11, 1, 2, 3, 7, 10}));
        Assertions.assertFalse(isUnique(new int[]{11, 1, 3, 3, 7, 10}));
    }

    public static boolean isUnique(final int[] nums) {
        Map<Integer, Boolean> uniques = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.get(nums[i]) != null) {
                return false;
            }
            uniques.put(nums[i], Boolean.TRUE);
        }
        return true;
    }
}
