package UltimateTTTGame.Server.Commands;

public class NewGame {
    private String gameType;

    public NewGame(String gameType) {
        this.gameType = gameType;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}