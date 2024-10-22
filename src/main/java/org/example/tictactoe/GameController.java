package org.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import org.example.tictactoe.Board;

public class GameController {
    private Board model;
    private BoardView view;

    public GameController(Board model, BoardView view) {
        this.model = model;
        this.view = view;
        initializeController();
    }

    private void initializeController() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int row = i;
                final int col = j;
                view.getButton(row, col).setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (model.makeMove(row, col)) {
                            view.updateCell(row, col, model.getCell(row, col));
                            if (model.isGameOver()) {
                                System.out.println("Player " + model.getCurrentPlayer() + " wins!");
                            }
                        }
                    }
                });
            }
        }
    }

    public void resetGame() {
        model.reset();
        view.resetBoard();
    }
}
