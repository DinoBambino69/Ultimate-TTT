package UltimateTTTGame.Server.room;

import UltimateTTTGame.Game.Cell;
import UltimateTTTGame.Server.Logic.GameLogic;
import UltimateTTTGame.Server.Players.Player;
import com.sun.nio.sctp.IllegalReceiveException;


public class GameRoom {
    private Player firstPlayer;
    private Player secondPlayer;
    private GameLogic gameLogic;
    private boolean isStart;

    public GameRoom() {
        gameLogic = new GameLogic();
    }

    public int nextStep(Player player, Cell cell) {
        if ((gameLogic.isFirstPlayerMover() && player.equals(firstPlayer))
                || (!gameLogic.isFirstPlayerMover() && player.equals(secondPlayer))) {
            return gameLogic.nextStep(cell);
        } else {
            throw new IllegalArgumentException("It is not step for player");
        }
    }

    public boolean isCellFree(Cell cell) {
        return gameLogic.isCellFree(cell);
    }

    public void join(Player player) {
        if (isStart) {
            throw new IllegalReceiveException("This game is already start");
        }
        if (firstPlayer == null && secondPlayer == null) {
            if (Math.random() < 0.5) {
                firstPlayer = player;
            } else {
                secondPlayer = player;
            }
        } else if (secondPlayer == null) {
            secondPlayer = player;
            isStart = true;
        } else {
            firstPlayer = player;
            isStart = true;
        }
    }

    public boolean isStart() {
        return isStart;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }
}