package br.com.cracking.coding.strings;

import java.util.ArrayList;
import java.util.List;

public class Exercise08ZeroMatrix {

    public static void main(String[] args) {
        int[] value = {0, 1};
/*        int[] value2 = {4, 5, 6};
        int[] value3 = {7, 8, 9};*/
        int[][] input = {value/*, value2, value3*/};
        Exercise08ZeroMatrix exercise08ZeroMatrix = new Exercise08ZeroMatrix();
        exercise08ZeroMatrix.setZeroes(input);
    }

    public void setZeroes(int[][] matrix) {
        final List<int[]> values = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                if (value == 0) {
                    int[] toAdd = {i, j};
                    values.add(toAdd);
                }
            }
        }

        for(int i = 0; i < values.size(); i++) {
            int[] index = values.get(i);
            topMatrix(matrix, index[0] , index[1]);
            rightMatrix(matrix, index[0] , index[1]);
            bottomMatrix(matrix, index[0] , index[1]);
            leftMatrix(matrix, index[0] , index[1]);
        }
    }

    public void topMatrix(int[][] matrix, int line, int column) {
        if (line < 0) {
            return;
        }
        matrix[line][column] = 0;
        topMatrix(matrix, line - 1, column);
    }

    public void rightMatrix(int[][] matrix, int line, int column) {
        if (column == matrix[line].length) {
            return;
        }
        matrix[line][column] = 0;
        rightMatrix(matrix, line, column + 1);
    }

    public void bottomMatrix(int[][] matrix, int line, int column) {
        if (line == matrix.length) {
            return;
        }
        matrix[line][column] = 0;
        bottomMatrix(matrix, line + 1, column);
    }

    public void leftMatrix(int[][] matrix, int line, int column) {
        if (column < 0) {
            return;
        }
        matrix[line][column] = 0;
        leftMatrix(matrix, line, column - 1);
    }
}
