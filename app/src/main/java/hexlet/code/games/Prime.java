package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void gamePrime() {
        Random random = new Random();
        String[][] sameNumber = new String[3][2];
        var requirement = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(1, 1000);

            sameNumber[i][0] = Integer.toString(number);
            sameNumber[i][1] = Prime.isPrime(number) ? "yes" : "no";
        }
        Engine.logic(requirement, sameNumber);
    }
}
