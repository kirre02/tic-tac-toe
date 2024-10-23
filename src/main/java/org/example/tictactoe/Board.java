package org.example.tictactoe;

public class Board {
    private final char[][] grid; // 3x3 grid
    private char currentPlayer; // 'X' or 'O'
    private boolean gameOver;

    public Board() {
        grid = new char[3][3];
        currentPlayer = 'X'; // X starts
        gameOver = false;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-'; // Empty spot
            }
        }
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean makeMove(int row, int col) {
        if (grid[row][col] == '-' && !gameOver) {
            grid[row][col] = currentPlayer;
            if (checkWinner()) {
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
            return true;
        }
        return false;
    }

    public boolean checkWinner() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == currentPlayer && grid[i][1] == currentPlayer && grid[i][2] == currentPlayer)
                return true;
            if (grid[0][i] == currentPlayer && grid[1][i] == currentPlayer && grid[2][i] == currentPlayer)
                return true;
        }
        if (grid[0][0] == currentPlayer && grid[1][1] == currentPlayer && grid[2][2] == currentPlayer)
            return true;

        return grid[0][2] == currentPlayer && grid[1][1] == currentPlayer && grid[2][0] == currentPlayer;
    }

    public void reset() {
        initializeBoard();
        currentPlayer = 'X';
        gameOver = false;
    }

    public char getCell(int row, int col) {
        return grid[row][col];
    }
}
