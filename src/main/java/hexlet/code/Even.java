package hexlet.code;

import java.util.Scanner;

class Even {
    public static void getEven() {
        int min = 1;
        int max = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        var name = scanner.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);

        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            var number = min + (int) (Math.random() * ((max - min) + 1));

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            var answer = scanner.next();

            if (number % 2 == 0 && answer.equalsIgnoreCase("yes")
                    || number % 2 != 0 && answer.equalsIgnoreCase("no"))
                System.out.println("Correct!");
            else {
                if (number % 2 == 0 && answer.equalsIgnoreCase("no")) {
                    System.out.println(
                            "'"
                                    + answer
                                    + "'"
                                    + " is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                                    + name
                                    + "!");

                    scanner.close();
                    System.exit(0);
                } else {
                    System.out.println(
                            "'"
                                    + answer
                                    + "'"
                                    + " is wrong answer ;(. "
                                    + "Correct answer was 'no'.\n"
                                    + "Let's try again, "
                                    + name
                                    + "!");

                    scanner.close();
                    System.exit(0);
                }
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
