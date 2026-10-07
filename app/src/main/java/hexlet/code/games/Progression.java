package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;

public class Progression {
    public static int[] getProgression() {
        Random random = new Random();

        int start = random.nextInt(1, 9);
        int step = random.nextInt(1, 9);
        int[] array = new int[random.nextInt(5, 15)];
        int counter = 0;

        while (counter < array.length) {
            array[counter] = start + counter * step;
            counter++;
        }

        return array;
    }

    public static void gameProgression() {
        Engine construct = new Engine();
        Random random = new Random();

        String[][] sameNumbers = new String[3][2];

        var requirement = "What number is missing in the progression ?";

        for (int i = 0; i < 3; i++) {
            var array = Progression.getProgression();

            var result = new String[array.length];
            var randomIndex = random.nextInt(0, array.length);

            for (int j = 0; j < array.length; j++) {
                result[j] = String.valueOf(array[j]);
                if (j == randomIndex) {
                    result[j] = "..";
                }
            }
            sameNumbers[i][0] =
                    Arrays.deepToString(result).replace("[", "").replace("]", "").replace(",", "");
            ;
            sameNumbers[i][1] = String.valueOf(array[randomIndex]);
        }

        construct.logic(requirement, sameNumbers);
    }
}
