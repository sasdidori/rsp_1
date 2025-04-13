package me.dora;

import me.dora.logic.CalculateWinner;
import me.dora.logic.MoveCollector;
import me.dora.model.Move;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> moves = new HashMap<>();
        moves.put("rock", "scissors");
        moves.put("scissors", "paper");
        moves.put("paper", "rock");
        Scanner scanner = new Scanner(System.in);
        Set<String> moveNames = moves.keySet();
        MoveCollector moveCollector = new MoveCollector(scanner, moveNames);
        Move move1 = moveCollector.collectMove();
        Move move2 = moveCollector.collectMove();
        CalculateWinner calculateWinner = new CalculateWinner(moves);
        String winner = calculateWinner.calculateWinner(move1, move2);
        System.out.println(winner);

    }
}