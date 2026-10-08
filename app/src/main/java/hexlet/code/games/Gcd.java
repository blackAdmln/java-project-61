package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    public static void gameGCD() {
        Engine construct = new Engine();
        Random random = new Random();

        String[][] sameNumbers = new String[3][2];

        var requirement = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(1, 100);
            int number2 = random.nextInt(1, 100);

            sameNumbers[i][0] = number1 + " " + number2;

            // if (number1 == 0) {
            // number2 = number1;
            // sameNumbers[i][1] = String.valueOf(number2);
            // continue;
            // } else if (number2 == 0) {
            // number1 = number2;
            // sameNumbers[i][1] = String.valueOf(number1);
            // continue;
            // } else {
            // while (number2 != 0) {
            // var tmp = number1;
            // number1 = number2;
            // number2 = tmp % number2;
            // }
            // }
            while (number2 != 0) {
                var tmp = number1;
                number1 = number2;
                number2 = tmp % number2;
            }

            sameNumbers[i][1] = String.valueOf(number1);
        }

        construct.logic(requirement, sameNumbers);
    }
}
