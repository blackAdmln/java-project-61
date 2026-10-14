package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;

public class Progression {
    public static String[] getProgression(int start, int step, int length) {
        int counter = 0;
        String[] progression = new String[length];

        while (counter < progression.length) {
            progression[counter] = String.valueOf(start + counter * step);
            counter++;
        }
        return progression;
    }

    public static void gameProgression() {
        Engine construct = new Engine();
        Random random = new Random();

        String[][] sameNumbers = new String[3][2];

        var requirement = "What number is missing in the progression?";

        for (int i = 0; i < 3; i++) {
            int start = random.nextInt(1, 9);
            int step = random.nextInt(1, 9);
            int length = random.nextInt(5, 15);

            String[] progression = Progression.getProgression(start, step, length);

            var result = new String[progression.length];
            var randomIndex = random.nextInt(0, progression.length);

            for (int j = 0; j < progression.length; j++) {
                result[j] = progression[j];
                if (j == randomIndex) {
                    result[j] = "..";
                }
            }
            sameNumbers[i][0] =
                    Arrays.deepToString(result).replace("[", "").replace("]", "").replace(",", "");
            sameNumbers[i][1] = String.valueOf(progression[randomIndex]);
        }

        construct.logic(requirement, sameNumbers);
    }
}
