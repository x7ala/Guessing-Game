public class highscore1 {


    static int highScore = 0;

    public static void score() {
        if (numbergame.hs == 0) {
            System.out.println("Guess the Number Best Score: Have not played yet");
        } else if (numbergame.hs < highScore) {
            highScore = numbergame.hs;
            System.out.println("Guess The Number Best Score: " + highScore + " Chances Used Up");
        } else if (numbergame.hs > highScore && highScore == 0) {
            highScore = numbergame.hs;
            System.out.println("Guess The Number Best Score: " + highScore + " Chances Used Up");
        } else {
            System.out.println("Guess The Number Best Score: " + highScore + " Chances Used Up");
        }

        mainmenu.mainMenu();
    }
}
