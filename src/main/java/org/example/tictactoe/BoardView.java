package org.example.tictactoe;

import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class BoardView {
    private final GridPane gridPane;
    private final Button[][] buttons;
    private final Label scoreLabelX;
    private final Label scoreLabelO;
    private final VBox mainLayout;

    public BoardView() {
        gridPane = new GridPane();
        buttons = new Button[3][3];
        scoreLabelX = new Label("Player X: 0");
        scoreLabelO = new Label("Player O: 0");

        createBoard();

        mainLayout = new VBox(10, scoreLabelX, scoreLabelO, gridPane);
        mainLayout.setAlignment(Pos.CENTER);
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

    public VBox getMainLayout() {
        return mainLayout;
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

    public void updateScoreDisplay(int scoreX, int scoreO) {
        scoreLabelX.setText("Player X: " + scoreX);
        scoreLabelO.setText("Player O: " + scoreO);
    }
}
