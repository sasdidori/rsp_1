package me.dora.logic;

import me.dora.model.Move;

import java.util.Scanner;
import java.util.Set;

public class MoveCollector {
    private final Scanner scanner;

    private final Set<String> moveNames;

    public MoveCollector(Scanner scanner, Set<String> moveNames) {
        this.scanner = scanner;
        this.moveNames = moveNames;
    }

    public Move collectMove() {
        System.out.println("enter move: ");
        String move = scanner.nextLine();
        boolean isValid = validateInput(move);
        System.out.println("valid? " + isValid);
        if (!isValid) {
          return collectMove();
        }
        return new Move(move);
    }

    private boolean validateInput(String move) {
        return moveNames.contains(move);
    }


}
