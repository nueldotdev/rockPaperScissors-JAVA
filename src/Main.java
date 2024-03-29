import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void display(String playerMove, String compMove, String result) {
        System.out.println("Your move: " + playerMove.toUpperCase());
        System.out.println("Comp. move: " + compMove);
        System.out.println(result);
    }

    public static void gamePlay() {
        String[] results = {"You win", "Tie", "Comp. wins"};
        String[] rps = {"R", "P", "S"};

        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Make a move (R, P, S): ");
        String playerMove = scanner.nextLine();

        if (playerMove.equalsIgnoreCase(computerMove))  {
            display(playerMove, computerMove, results[1]);
        }

        // For playerMove == R (Rock)
        else if (playerMove.equalsIgnoreCase("R") & computerMove.equals("P")) {
            display(playerMove, computerMove, results[2]);
        } else if (playerMove.equalsIgnoreCase("R") & computerMove.equals("S")) {
            display(playerMove, computerMove, results[0]);
        }

        // For playerMove == P (Paper)
        else if (playerMove.equalsIgnoreCase("P") & computerMove.equals("R")) {
            display(playerMove, computerMove, results[0]);
        }
        else if (playerMove.equalsIgnoreCase("P") & computerMove.equals("S")) {
            display(playerMove, computerMove, results[2]);
        }

        // For playerMove == S (Scissors)
        else if (playerMove.equalsIgnoreCase("S") & computerMove.equals("P")) {
            display(playerMove, computerMove, results[0]);
        }
        else if (playerMove.equalsIgnoreCase("S") & computerMove.equals("R")) {
            display(playerMove, computerMove, results[2]);
        }

    }

    public static void main(String[] args) {
        gamePlay();
    }
}
