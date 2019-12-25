package UltimateTTTGame.Game;

public enum Winner {
    NONE(""),
    X("-fx-color: red;"),
    O("-fx-color: yellow"),
    TIE("-fx-color: green;");

    private final String style;

    Winner(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}