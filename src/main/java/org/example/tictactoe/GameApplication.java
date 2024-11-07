package org.example.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Board model = new Board();
        BoardView view = new BoardView();
        GameController controller = new GameController(model, view);

        Scene scene = new Scene(view.getMainLayout(), 400, 500);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
