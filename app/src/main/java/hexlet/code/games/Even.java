package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static boolean isEven(int number) {
        if (number % 2 == 0) return true;

        return false;
    }

    public static void gameEven() {
        Random random = new Random();
        String[][] sameNumber = new String[3][2];
        var requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(1, 9999);
            sameNumber[i][0] = Integer.toString(number);
            sameNumber[i][1] = Even.isEven(number) ? "yes" : "no";
        }

        Engine.logic(requirement, sameNumber);
    }
}
