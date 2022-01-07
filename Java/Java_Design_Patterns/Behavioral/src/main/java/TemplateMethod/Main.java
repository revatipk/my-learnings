package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Game football = new Football();
        Game chess = new Chess();
        football.play();
        chess.play();
    }
}
