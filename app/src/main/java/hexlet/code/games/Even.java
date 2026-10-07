package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
	public static void gameEven() {
		Engine construct = new Engine();
		Random random = new Random();

		String[][] sameNumber = new String[3][2];

		var requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";

		for (int i = 0; i < 3; i++) {
			sameNumber[i][0] = Integer.toString(random.nextInt(1, 1000));
			sameNumber[i][1] = (Integer.parseInt(sameNumber[i][0]) % 2 == 0) ? "yes" : "no";
		}
		construct.logic(requirement, sameNumber);
	}
}
