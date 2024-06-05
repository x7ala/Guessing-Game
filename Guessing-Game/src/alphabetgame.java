import java.util.Random;
import java.util.Scanner;

public class alphabetgame {


    static int hs;

    public static void alphabetGame() {
        System.out.println("\nStart menu");
        System.out.println("----------");
        System.out.println("Choose the Difficulty Level: ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.println("4. Return to main menu");
        char guess;
        Scanner difflevel = new Scanner(System.in);
        int level = difflevel.nextInt();
        if (level < 5 && level > 0) {
            System.out.println("===>" + level);
        } else {
            System.out.println("Invalid Option,Try Again!");
        }


        if (level == 1) {
            System.out.println("\nGuess the Alphabet");
            System.out.println("----------------");
            System.out.println("Instructions:");
            System.out.println("1. Guess the vowel alphabet.");
            System.out.println("2. You are allowed to make one guess at a time.");
            System.out.println("3. Each game has 2 chances to guess the correct letter.");
            System.out.println("4. Once you have used up all your chances, you lose the game.\n");
            System.out.println("\nGood Luck!\n");
            System.out.println("Easy:");


            boolean play = true;

            Scanner console = new Scanner(System.in);
            int chances = 2;
            int numGuesses = 1;
            while (play) {

                String alphabet = "aeiou";
                Random r = new Random();
                char c = alphabet.charAt(r.nextInt(alphabet.length()));


                do {
                    System.out.println("Enter a vowel: " + chances + " chances left.");
                    guess = console.next().charAt(0);
                    if (guess > c) {
                        System.out.println("Inocrrect, your guess was too high!");
                        chances--;
                        numGuesses++;
                    } else if (guess < c) {
                        System.out.println("Incorrect, your guess was too low!");
                        chances--;
                        numGuesses++;
                    }

                }
                while (guess != c && numGuesses <= 2);
                if (c == guess) {
                    System.out.println("Correct, You've won with just " + numGuesses + " tries!");

                    hs = numGuesses;
                    alphabetgame.alphabetGame();
                } else {
                    System.out.println("You've lost");
                    alphabetgame.alphabetGame();
                }

            }

        } else if (level == 2) {
            System.out.println("\nGuess the Alphabet");
            System.out.println("----------------");
            System.out.println("Instructions:");
            System.out.println("1. Guess the consonant alphabet");
            System.out.println("2. You are allowed to make one guess at a time.");
            System.out.println("3. Each game has 4 chances to guess the correct letter.");
            System.out.println("4. Once you have used up all your chances, you lose the game.\n");
            System.out.println("\nGood Luck!\n");
            System.out.println("Medium:");


            int numGuesses = 1;
            int chances = 4;
            Scanner console = new Scanner(System.in);

            while (true) {
                String alphabet = "bcdfghjklmnpqrstvwxyz";
                Random r = new Random();
                char c = alphabet.charAt(r.nextInt(alphabet.length()));


                do {
                    System.out.println("Enter a letter, " + chances + " Chances left!");
                    guess = console.next().charAt(0);
                    if (guess < c) {
                        System.out.println("Incorrect, your guess was too low");
                        numGuesses++;
                        chances--;
                    } else if (guess > c) {
                        System.out.println("Incorrect, your guess was too high");
                        numGuesses++;
                        chances--;
                    }
                }
                while (guess != c && numGuesses <= 4);

                if (guess == c) {
                    System.out.println("Correct, you've won the game with just " + numGuesses + " tries!");
                    hs = numGuesses;
                    alphabetgame.alphabetGame();

                } else {
                    System.out.println("You've lost");
                    alphabetgame.alphabetGame();
                }

            }

        } else if (level == 3) {
            System.out.println("\nGuess the Alphabet");
            System.out.println("----------------");
            System.out.println("Instructions:");
            System.out.println("1. Guess the alphabet");
            System.out.println("2. You are allowed to make one guess at a time.");
            System.out.println("3. Each game has 5 chances to guess the correct letter.");
            System.out.println("4. Once you have used up all your chances, you lose the game.\n");
            System.out.println("\nGood Luck!\n");
            System.out.println("Hard:");

            int numGuesses = 1;
            int chances = 5;
            Scanner console = new Scanner(System.in);
            while (true) {
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                Random r = new Random();
                char c = alphabet.charAt(r.nextInt(alphabet.length()));


                do {
                    System.out.println("Enter a letter, " + chances + " Chances left!");
                    guess = console.next().charAt(0);

                    if (guess < c) {
                        System.out.println("Incorrect, your guess was too low!");
                        chances--;
                        numGuesses++;
                    } else if (guess > c) {
                        System.out.println("Incorrect, your guess was too high!");
                        chances--;
                        numGuesses++;
                    }
                }
                while (guess != c && numGuesses <= 5);

                if (guess == c) {
                    System.out.println("Correct, you've won with just " + numGuesses + " tries!");
                    hs = numGuesses;
                    alphabetgame.alphabetGame();

                } else if (guess != c) {
                    System.out.println("you've lost!");
                    alphabetgame.alphabetGame();
                }

            }

        } else if (level == 4) {
            mainmenu.mainMenu();
        }
    }
}
