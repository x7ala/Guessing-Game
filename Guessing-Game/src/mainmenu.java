import java.util.Scanner;

public class mainmenu {


    public static void mainMenu() {
        System.out.println("\nMENU: ");
        System.out.println("----");
        System.out.println("1. Guess the Number");
        System.out.println("2. Guess the Alphabet");
        System.out.println("3. High Score");
        System.out.println("4. Credits");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");

        Scanner console = new Scanner(System.in);
        int listchoice = console.nextInt();


        if (listchoice == 1) {

            numbergame.numberGame();
        }
        else if (listchoice ==2)
        {

            alphabetgame.alphabetGame();
        }
        else if (listchoice ==3)
        {
            highscore.score();
            highscore1.score();
        }
        else if (listchoice == 4) {
            Credits.credits();
        } else if (listchoice == 5) {
            System.exit(0);
        } else {
            System.out.println("Invalid Option. Please try again.");
            mainMenu();
        }
    }

}