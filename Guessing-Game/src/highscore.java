public class highscore {

    static int highScore = 0;

    public static void score() {
        if (alphabetgame.hs == 0) {
            System.out.println("Guess the Alphabet Best Score: Have not played yet");
        } else if (alphabetgame.hs < highScore) {
            highScore = alphabetgame.hs;


            System.out.println("Guess The Alphabet Best Score: " + highScore + " Chances Used Up");
        } else if (alphabetgame.hs > highScore && highScore == 0) {
            highScore = alphabetgame.hs;
            System.out.println("Guess The Alphabet Best Score: " + highScore + " Chances Used Up");
        } else {
            System.out.println("Guess The Alphabet Best Score: " + highScore + " Chances Used Up");
        }


    }
}
