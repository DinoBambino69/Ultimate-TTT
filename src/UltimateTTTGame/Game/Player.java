package UltimateTTTGame.Game;

public enum Player {
    X("-fx-text-fill: red;"),
    O("-fx-text-fill: blue;");

    private final String style;

    Player(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}