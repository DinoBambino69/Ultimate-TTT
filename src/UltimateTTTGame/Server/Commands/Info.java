package UltimateTTTGame.Server.Commands;


public class Info {
    private String gameStatus;

    private String enemy;

    public Info() {
    }

    public Info(String gameStatus, String enemy) {
        this.gameStatus = gameStatus;
        this.enemy = enemy;
    }

    public Info(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }
}