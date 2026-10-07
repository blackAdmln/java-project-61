package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void gamePrime() {
        Engine construct = new Engine();
        Random random = new Random();

        String[][] sameNumber = new String[3][2];

        var requirement = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {
            boolean primeNumber = true;
            sameNumber[i][0] = Integer.toString(random.nextInt(1, 1000));
            int refNumber = Integer.parseInt(sameNumber[i][0]);

            if (refNumber < 2) {
                primeNumber = false;
            } else {
                for (int j = 2; j <= Math.sqrt(refNumber); j++) {
                    if (refNumber % j == 0) {
                        primeNumber = false;
                        break;
                    }
                }
            }
            sameNumber[i][1] = primeNumber ? "yes" : "no";
        }
        construct.logic(requirement, sameNumber);
    }
}
