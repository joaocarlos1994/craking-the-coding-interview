package br.com.cracking.coding.strings;

import java.util.Arrays;

public class Exercise07RotateMatrix {

    public static void main(String[] args) {
        int[] value = {1, 2, 3};
        int[] value2 = {4, 5, 6};
        int[] value3 = {7, 8, 9};
        int[][] input = {value, value2, value3};
        rotate(input);
    }

    public static void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return; // Not a square
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first; //distance from beginner at specific point
                int top = matrix[first][i]; //save top

                matrix[first][i] = matrix[last - offset][first]; // left -> top
                matrix[last - offset][first] = matrix[last][last - offset]; // bottom -> left
                matrix[last][last - offset] = matrix[i][last]; // right -> bottom
                matrix[i][last] = top; // top -> right
            }
        }
    }
}
