package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    public static int calculationOfGcd(int number1, int number2) {
        while (number2 != 0) {
            var tmp = number1;
            number1 = number2;
            number2 = tmp % number2;
        }

        return number1;
    }

    public static void gameGCD() {
        Random random = new Random();
        String[][] sameNumbers = new String[3][2];
        var requirement = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(1, 100);
            int number2 = random.nextInt(1, 100);

            sameNumbers[i][0] = number1 + " " + number2;
            sameNumbers[i][1] = String.valueOf(calculationOfGcd(number1, number2));
        }

        Engine.logic(requirement, sameNumbers);
    }
}
