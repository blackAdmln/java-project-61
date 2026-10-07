package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        Engine answer = new Engine(scanner);

        return answer.greeting();
    }
}
