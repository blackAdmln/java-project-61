package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
	public static void gameCalc() {
		Random random = new Random();
		Engine construct = new Engine();

		var requirement = "What is the result of the expression?";
		char[] operation = { '+', '-', '*' };
		String[][] sameNumbers = new String[3][2];

		for (int i = 0; i < 3; i++) {
			int operand1 = random.nextInt(1, 25);
			int operand2 = random.nextInt(1, 25);

			var indexOperation = random.nextInt(operation.length);
			var strOperation = operation[indexOperation];

			sameNumbers[i][0] = operand1 + " " + String.valueOf(strOperation) + " " + operand2;
			switch (indexOperation) {
				case 0:
					sameNumbers[i][1] = String.valueOf(operand1 + operand2);
					break;
				case 1:
					sameNumbers[i][1] = String.valueOf(operand1 - operand2);
					break;
				case 2:
					sameNumbers[i][1] = String.valueOf(operand1 * operand2);
					break;
				default:
					break;
			}
		}
		construct.logic(requirement, sameNumbers);
	}
}
