package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int choice = Integer.parseInt(mainScanner.next());

        switch (choice) {
            case 0:
                mainScanner.close();
                break;
            case 1:
                Cli.getName();
                break;
            case 2:
                Even.gameEven();
                break;
            case 3:
                Calc.gameCalc();
                break;
            case 4:
                Gcd.gameGCD();
                break;
            case 5:
                Progression.gameProgression();
                break;
            case 6:
                Prime.gamePrime();
                break;
            default:
                mainScanner.close();
                break;
        }
    }
}
