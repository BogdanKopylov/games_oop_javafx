package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            boolean isOne = board[i][i] == 1;
            if (isOne && ((checkHorizontal(board, i)) || (checkVertical(board, i)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHorizontal(int[][] board, int index) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
                if (board[index][i] == 0) {
                    break;
                } else if (board[index][i] == 1) {
                    count++;
                    if (count == board.length) {
                        return true;
                    }
                }
        }
        return false;
    }

    public static boolean checkVertical(int[][] board, int index) {
        int count = 0;
        for (int[] ints : board) {
            if (ints[index] == 0) {
                break;
            } else if (ints[index] == 1) {
                count++;
                if (count == board.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
