package org.example.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

public class GameApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Board model = new Board();
        BoardView view = new BoardView();
        GameController controller = new GameController(model, view);

        VBox vbox = new VBox();

        vbox.getChildren().addAll(view.getBoard());

        Scene scene = new Scene(vbox, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
