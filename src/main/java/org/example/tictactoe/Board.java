package org.example.tictactoe;

public class Board {
    private final char[][] grid;
    private char currentPlayer;
    private boolean gameOver;

    public Board() {
        grid = new char[3][3];
        currentPlayer = 'X';
        gameOver = false;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-';
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
        System.out.println(currentPlayer);
        if (grid[row][col] == '-' && !gameOver) {
            grid[row][col] = currentPlayer;
            if (checkWinner()) {
                System.out.println(currentPlayer + " has won");
                gameOver = true;
            } else if (isFull()) {
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
            return true;
        }
        return false;
    }

    private boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWinner() {
        System.out.println(currentPlayer);
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
