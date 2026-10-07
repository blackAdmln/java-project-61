package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void gameEven() {
        Engine construct = new Engine();

        int min = 1;
        int max = 1000;

        String[][] sameNumber = new String[3][2];

        var requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {
            sameNumber[i][0] = Integer.toString(min + (int) (Math.random() * ((max - min) + 1)));
            sameNumber[i][1] = (Integer.parseInt(sameNumber[i][0]) % 2 == 0) ? "yes" : "no";
        }
        construct.logic(requirement, sameNumber);
    }
}
