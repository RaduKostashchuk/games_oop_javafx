package ru.job4j.puzzle;

public class Win {
    public static boolean checkColumn(int[][] board, int cell) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkRow(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
         // Check row and column
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1
                    && (checkColumn(board, index) || checkRow(board, index))) {
                return true;
            }
        }

        return false;
    }
}
