package UltimateTTTGame;

import UltimateTTTGame.Game.TicTacToeBoard;
import javafx.stage.Stage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeBoardTest {

    @org.junit.jupiter.api.Test
    void toggleGameStatus() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        boolean check = ticTacToeBoard.isGameOver();
        ticTacToeBoard.toggleGameStatus();
        boolean check2 = ticTacToeBoard.isGameOver();
        Assert.assertTrue(check != check2);
    }

}