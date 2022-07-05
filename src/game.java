import java.util.concurrent.ThreadLocalRandom;

public class game {
    public static void startGame() {
        // 1 rock
        // 2 paper
        // 3 scissors
        int botChoice = ThreadLocalRandom.current().nextInt(1,4);
        String botResponse;
            if (botChoice == 1) {
                botResponse = "rock";
            } else if (botChoice == 2) {
                botResponse = "paper";
            } else {
                botResponse = "scissors";
            }
        System.out.println("Rock, Paper, or Scissors?");
        String userChoice = Main.scanner.nextLine().toLowerCase();

        switch (userChoice)
        {
            case "rock":
                System.out.println("\nOpponent: " + botResponse);
                    if (botResponse == "rock") {
                        System.out.println("tie");
                    } else if (botResponse == "paper") {
                        System.out.println("you lose");
                        Main.aiScore++;
                    } else if (botResponse == "scissors") {
                        Main.userScore++;
                        System.out.println("you win");
                    }
                Main.promptRestart();
                break;

            case "paper":
                System.out.println("\nOpponent: " + botResponse);
                    if (botResponse == "rock") {
                        Main.userScore++;
                        System.out.println("you win");
                    } else if (botResponse == "paper") {
                        System.out.println("tie");
                    } else if (botResponse == "scissors") {
                        Main.aiScore++;
                        System.out.println("you lose");
                    }
                Main.promptRestart();
                break;

            case "scissors":
                System.out.println("\nOpponent: " + botResponse);
                    if (botResponse == "rock") {
                        Main.aiScore++;
                        System.out.println("you lose");
                    } else if (botResponse == "paper") {
                        Main.userScore++;
                        System.out.println("you win");
                    } else if (botResponse == "scissors") {
                        System.out.println("tie");
                    }
                Main.promptRestart();
                break;

            default:
                System.out.println("\nInvalid response!");
                break;

        }
    }
}

