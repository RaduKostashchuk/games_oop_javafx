package ru.job4j.puzzle;

public class Win {
    public static boolean checkDiag(int[][] board) {
        boolean result = true;
        for (int index = 1; index < board.length; index++) {
            if (board[index][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkBackDiag(int[][] board) {
        boolean result = true;
        for (int index = 1; index < board.length; index++) {
            if (board[index][board.length - 1 - index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkColumn(int[][] board, int cell) {
        boolean result = true;
        for (int row = 1; row < board.length; row++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkRow(int[][] board, int row) {
        boolean result = true;
        for (int cell = 1; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean rsl = true;
        // Check diag
        if (board[0][0] == 1) {
            if (checkDiag(board)) {
                return rsl;
            }
        }
        // Check backward diag
        if (board[0][board.length - 1] == 1) {
            if (checkBackDiag(board)) {
                return rsl;
            }
        }
        // Check row and column
        for (int index = 0; index < board[0].length; index++) {
            if (board[0][index] == 1) {
                if(checkColumn(board, index)) {
                    return rsl;
                }
            }

            if (board[index][0] == 1) {
                if(checkRow(board, index)) {
                    return rsl;
                }
            }
        }
        return rsl = false;
    }
}
