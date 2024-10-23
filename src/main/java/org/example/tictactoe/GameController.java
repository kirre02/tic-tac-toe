package org.example.tictactoe;

public class GameController {
    private final Board board;
    private final BoardView view;
    private final Computer computer;

    public GameController(Board model, BoardView view) {
        this.board = model;
        this.view = view;
        this.computer = new Computer(board);
        initializeController();
    }

    private void initializeController() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int row = i;
                final int col = j;
                view.getButton(row, col).setOnMouseClicked(event -> {
                    if (board.makeMove(row, col)) {
                        view.updateCell(row, col, board.getCell(row, col));
                        if (!board.isGameOver()) {
                            computer.makeMove();
                            updateView();
                        } else {
                            System.out.println("Player " + board.getCurrentPlayer() + " wins!");
                            resetGame();
                        }
                    }
                });
            }
        }
    }

    private void updateView() {
        // Refresh the view with the current state of the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                view.updateCell(i, j, board.getCell(i, j));
            }
        }
    }

    public void resetGame() {
        board.reset();
        view.resetBoard();
    }
}
