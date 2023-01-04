import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Chloe's Hangman Game!");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name + " please select a level to begin.\n1. Easy\n2. Medium\n3. Hard\nType in any other number for the default level");
        int level = scan.nextInt();
        if (level > 0 && level <= 3) {
            Game g1 = new Game(level);
        } else {
            Game g1 = new Game();
        }
        Game g1 = new Game(level);
        g1.word();
        g1.dotLine();
        System.out.println(g1.getDotLine());
        while (g1.isPlaying()) {
            System.out.println("Enter your guess (whole word or a single character): ");
            String guess = scan.nextLine();
            if (guess.length() > 0) {
                if (guess.length() > 1) {
                    System.out.println(g1.fullGuess(guess));
                    Game.hangman();
                } else {
                    System.out.println(g1.charGuess(guess));
                    Game.hangman();
                }
            }
        }

    }
}