package hexlet.code;

import java.util.Scanner;

public class Engine {

    public Engine() {}

    public void logic(String requirement, String[][] question) {
        Scanner answer = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        var name = answer.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);

        System.out.println("Hello, " + name + "!");

        System.out.println(requirement);

        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + question[i][0]);
            System.out.print("Your answer: ");

            var enter = answer.next();

            if (enter.equalsIgnoreCase(question[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'"
                                + enter
                                + "'"
                                + " is wrong answer ;(. Correct answer was "
                                + "'"
                                + question[i][1]
                                + "'"
                                + ". Let's try again, "
                                + name
                                + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");

        answer.close();
    }
}
