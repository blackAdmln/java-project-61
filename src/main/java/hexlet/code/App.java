package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n");
        System.out.print("1 - Greet\n");
        System.out.print("2 - Even\n");
        System.out.print("3 - Calc\n");
        System.out.print("4 - GCD\n");
        System.out.print("5 - Progression\n");
        System.out.print("6 - Prime\n");
        System.out.print("0 - Exit\n");

        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.next());

        switch (choice) {
            case 0:
                scanner.close();
                break;
            case 1:
                Cli.getName();
                break;
            case 2:
                Even.getEven();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                scanner.close();
                break;
        }
    }
}
