package UltimateTTTGame.Game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameStart extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Ultimate Tic Tac Toe!");
        stage.setScene(new Scene(new TicTacToeGame(stage)));
        stage.show();
    }
}