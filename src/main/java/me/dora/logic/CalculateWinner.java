package me.dora.logic;

import me.dora.model.Move;

import java.util.HashMap;

public class CalculateWinner {

    private final HashMap<String, String> moves;

    public CalculateWinner(HashMap<String, String> moves) {
        this.moves = moves;
    }

    public String calculateWinner(Move move1, Move move2) {
        String move1WinsAgainst = moves.get(move1.getMove());
        if (move1.getMove().equals(move2.getMove())) {
            return "it's a TIE";
        } else {
            if (move2.getMove().equals(move1WinsAgainst)) {
                return "the winner is: " + move1.getMove();
            }
            return "the winner is: " + move2.getMove();
        }
    }

}
