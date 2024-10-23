package org.example.tictactoe;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class BoardView {
    private final GridPane gridPane;
    private final Button[][] buttons;

    public BoardView() {
        gridPane = new GridPane();
        buttons = new Button[3][3];
        createBoard();
    }

    private void createBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = new Button("");
                btn.setMinSize(100, 100);
                buttons[i][j] = btn;
                gridPane.add(btn, j, i);
            }
        }
        gridPane.setAlignment(Pos.CENTER);
    }

    public GridPane getBoard() {
        return gridPane;
    }

    public Button getButton(int row, int col) {
        return buttons[row][col];
    }

    public void updateCell(int row, int col, char symbol) {
        buttons[row][col].setText(String.valueOf(symbol));
    }

    public void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
    }
}
