package hexlet.code.games;

import hexlet.code.Engine;
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
        Random random = new Random();
        String[][] sameNumbers = new String[3][2];
        var requirement = "What number is missing in the progression?";

        for (int i = 0; i < 3; i++) {
            int start = random.nextInt(1, 9);
            int step = random.nextInt(1, 9);
            int length = random.nextInt(5, 15);

            var progression = Progression.getProgression(start, step, length);
            var randomNumber = progression[random.nextInt(0, progression.length)];

            var question = String.join(" ", progression);

            sameNumbers[i][0] = question.replace(randomNumber, "..");
            sameNumbers[i][1] = randomNumber;
        }

        Engine.logic(requirement, sameNumbers);
    }
}
