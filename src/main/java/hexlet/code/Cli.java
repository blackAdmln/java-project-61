package hexlet.code;

import java.util.*;

class Cli {
    public static String getName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var name = scanner.next();

        System.out.println(
                "Hello, " + name.substring(0, 1).toUpperCase() + name.substring(1) + "!");

        scanner.close();

        return name;
    }
}
