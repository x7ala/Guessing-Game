import java.util.Random;
import java.util.Scanner;

public class numbergame {


    static int hs;

    public static void numberGame() {
        System.out.println("\nStart menu");
        System.out.println("----------");
        System.out.println("Choose the Difficulty Level: ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.println("4. Return to main menu");
        int guess;
        Scanner difflevel = new Scanner(System.in);
        int level = difflevel.nextInt();
        if (level < 5 && level > 0) {
            System.out.println("===>" + level);
        } else {
            System.out.println("Invalid Option,Try Again!");
        }
        Random rand = new Random();
        int numGuesses = 0;
        int Num;

        if (level == 1) {
            System.out.println("\nGuess the Number");
            System.out.println("----------------");
            System.out.println("Instructions:");
            System.out.println("1. Guess the number based on the given range.");
            System.out.println("2. You are allowed to make one guess at a time.");
            System.out.println("3. Each game has 5 chances to guess the correct number.");
            System.out.println("4. Once you have used up all your chances, you lose the game.\n");
            System.out.println("\nGood Luck!\n");
            System.out.println("Easy:");


            Scanner console = new Scanner(System.in);

            while (true) {
                Num = rand.nextInt(15) + 1;
                System.out.println("Enter guess number from 1 to 15.");

                do {
                    guess = console.nextInt();
                    numGuesses++;
                    if (guess > Num)
                        System.out.println("Wrong! Your guess was too high.");
                    else if (guess < Num)
                        System.out.println("Wrong! Your guess was too low.");
                } while (guess != Num && numGuesses < 5);

                if (guess == Num) {
                    System.out.println("Correct! You've won the game with just " + numGuesses + " times");
                    hs = numGuesses;
                    numbergame.numberGame();
                } else {
                    System.out.println("You lost the game.");
                    numbergame.numberGame();
                }


            }
        } else if (level == 2) {
            System.out.println("\nGuess the Number");
            System.out.println("----------------");
            System.out.println("Instructions:");
            System.out.println("1. Guess the number based on the given range.");
            System.out.println("2. You are allowed to make one guess at a time.");
            System.out.println("3. Each game has 4 chances to guess the correct number.");
            System.out.println("4. Once you have used up all your chances, you lose the game.\n");
            System.out.println("\nGood Luck!\n");
            System.out.println("Medium:");
            while (true) {
                Num = rand.nextInt(20) + 1;
                int chances = 4;
                System.out.println("Enter guess number: (1 to 20). " + chances + " chances left.");


                Scanner console = new Scanner(System.in);

                do {
                    chances--;
                    guess = console.nextInt();
                    numGuesses++;
                    if (guess > Num) {
                        System.out.println("Enter guess number: (1 to 20). " + chances + " chances left.");
                    } else if (guess < Num) {
                        System.out.println("Enter guess number: (1 to 20). " + chances + " chances left.");
                    }

                } while (guess != Num && numGuesses < 4);

                if (guess == Num) {
                    System.out.println("Correct! You've won the game with just " + numGuesses + " times");
                    hs = numGuesses;
                    numbergame.numberGame();
                } else {
                    System.out.println("You lost the game.");
                    numbergame.numberGame();
                }


            }

        } else if (level == 3) {
            System.out.println("\nGuess the Number");
            System.out.println("----------------");
            System.out.println("Instructions:");
            System.out.println("1. Guess the number based on the given range.");
            System.out.println("2. You are allowed to make one guess at a time.");
            System.out.println("3. Each game has 3 chances to guess the correct number.");
            System.out.println("4. Once you have used up all your chances, you lose the game.\n");
            System.out.println("\nGood Luck!\n");
            System.out.println("Hard:");

            while (true) {
                Num = rand.nextInt(40) + 1;
                int chances = 3;
                System.out.println("Enter guess number: (1 to 40). " + chances + " chances left.");


                Scanner console = new Scanner(System.in);

                do {
                    chances--;
                    guess = console.nextInt();
                    numGuesses++;
                    if (guess > Num) {
                        System.out.println("Enter guess number: (1 to 40). " + chances + " chances left.");
                    } else if (guess < Num) {
                        System.out.println("Enter guess number: (1 to 40). " + chances + " chances left.");
                    }

                } while (guess != Num && numGuesses < 3);

                if (guess == Num) {
                    System.out.println("Correct! You've won the game with just " + numGuesses + " times");
                    hs = numGuesses;
                    numbergame.numberGame();
                } else {
                    System.out.println("You lost the game.");
                    numbergame.numberGame();
                }


            }

        } else {
            mainmenu.mainMenu();
        }

    }
}
