package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static String getOperator() {
        Random random = new Random();
        char[] operation = {'+', '-', '*'};

        String strOperation = String.valueOf(operation[random.nextInt(operation.length)]);

        return strOperation;
    }

    public static int calculation(int operand1, int operand2, String operator) {
        int result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            default:
                throw new Error("Unknown operator: " + operator);
        }
        return result;
    }

    public static void gameCalc() {
        Random random = new Random();
        Engine construct = new Engine();

        var requirement = "What is the result of the expression?";
        String[][] sameNumbers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int operand1 = random.nextInt(1, 100);
            int operand2 = random.nextInt(1, 100);
            String operator = Calc.getOperator();

            sameNumbers[i][0] = operand1 + " " + operator + " " + operand2;
            sameNumbers[i][1] = Integer.toString(Calc.calculation(operand1, operand2, operator));
        }
        construct.logic(requirement, sameNumbers);
    }
}
