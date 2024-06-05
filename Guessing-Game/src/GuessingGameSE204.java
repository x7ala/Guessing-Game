import javax.swing.*;
import java.util.Random;
import java.util.Scanner;


public class GuessingGameSE204 {

    public static void main(String[] args) {

        mainmenu.mainMenu();
        Scanner choice = new Scanner(System.in);
        int c = choice.nextInt();

        switch (c) {

            case 1:

                numberGame();
                break;

            case 2:
                alphabetgame.alphabetGame();

                break;

            case 3:
                highscore.score();
                highscore1.score();
                break;

            case 4:
                System.out.println("\nStudent Name: us");
                System.out.println("Student ID: 210209353");
                System.out.println("Course of Study: Software Engineering");
                mainmenu.mainMenu();
                break;

            case 5:
                System.exit(0);

                break;

            default:
                System.out.println("\nInvalid option. Please try again.");
                mainmenu.mainMenu();

                break;

        }
    }

    public static void mainMenu() {
        mainmenu.mainMenu();
    }

    public static void credits() {
        Credits.credits();
    }

    public static void numberGame() {
        numbergame.numberGame();
    }

    public static void alphabetGame() {
        alphabetgame.alphabetGame();
    }
}


