import java.util.Scanner;
public class Main {
    static int userScore;
    static int aiScore;

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        game gameObject = new game();
        System.out.println("--------------------------\n| Welcome to RPS Online! |\n--------------------------");
        System.out.println("are you ready? yes / no");
        String decision = scanner.nextLine().toLowerCase();
        newScreen();
        if(decision.equals("yes"))
        {
            Main.userScore = 0;
            Main.aiScore = 0;
            gameObject.startGame();
        } else {
            System.out.println("fuck you");
        }
    }
    public static void promptRestart() {
        game gameObject = new game();
        Main.score();
        System.out.println("\nplay again? yes / no");
        String decision = Main.scanner.nextLine().toLowerCase();
        if(decision.equals("yes"))
        {
            newScreen();
            gameObject.startGame();
        } else {
            newScreen();
            System.out.println("thank you for playing");
        }
    }
    public static void score() {
        System.out.println("\n------------------\nUser Score: " + userScore + "\nAI Score: " + aiScore + "\n------------------");
    }
    public static void newScreen() {
        for(int i = 0 ; i < 20 ; i++) {
            System.out.println();
        }
    }
}
