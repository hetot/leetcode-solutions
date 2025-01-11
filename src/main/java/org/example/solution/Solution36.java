package org.example.solution;

import java.util.HashSet;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            var rowSet = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (rowSet.contains(board[i][j])) {
                    return false;
                }
                rowSet.add(board[i][j]);
            }
        }

        for (int i = 0; i < 9; i++) {
            var colSet = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (colSet.contains(board[j][i])) {
                    return false;
                }
                colSet.add(board[j][i]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                var rowIndex = i * 3;
                var colIndex = j * 3;
                if (!subSquare(board, rowIndex, colIndex)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean subSquare(char[][] board, int rowIndex, int colIndex) {
        var numSet = new HashSet<Character>();
        for (int i = rowIndex; i < rowIndex + 3; i++) {
            for (int j = colIndex; j < colIndex + 3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (numSet.contains(board[i][j])) {
                    return false;
                }
                numSet.add(board[i][j]);
            }
        }
        return true;
    }
}
