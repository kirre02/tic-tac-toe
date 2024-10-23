package org.example.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    private final Board board;
    private final Random rand;

    public Computer(Board board) {
        this.board = board;
        this.rand = new Random();
    }

    public void makeMove() {
        if (!board.isGameOver()) {
            List<int[]> availableMoves = getAvailableMoves();
            if (!availableMoves.isEmpty()) {
                int[] move = availableMoves.get(rand.nextInt(availableMoves.size())); // Choose a random move
                board.makeMove(move[0], move[1]);
            }
        }
    }

    private List<int[]> getAvailableMoves() {
        List<int[]> availableMoves = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.getCell(i, j) == '-') { // Empty cells
                    availableMoves.add(new int[]{i, j});
                }
            }
        }
        return availableMoves;
    }
}
