package me.dora.model;

public class Move {

    private String move;


    public Move(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    @Override
    public String toString() {
        return "Move{" +
                "move='" + move + '\'' +
                '}';
    }
}
