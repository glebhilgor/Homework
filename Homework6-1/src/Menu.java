import java.util.Scanner;

public class Menu {

    public Menu() {
        int[] array = new int[10];
        int i = 0;
        int result = 0;
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 for working or 0 for exit");
        if (scan.hasNextInt()) {
            int j = scan.nextInt();
            while (j == 1) {
                System.out.println("Enter the first number");
                if (scan.hasNextInt()) {
                    int a = scan.nextInt();
                    System.out.println("Enter the second number");
                    if (scan.hasNextInt()) {
                        int b = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Enter the operation (+, -, *, /)");
                        if (scan.hasNext("[*/+-]")) {
                            String input = scan.nextLine();

                            switch (input) {
                                case "+":
                                    Plus plus = new Plus();
                                    plus.Action(a, b);
                                    break;
                                case "-":
                                    Minus minus = new Minus();
                                    minus.Action(a, b);
                                    break;
                                case "*":
                                    Umnozh umnozh = new Umnozh();
                                    umnozh.Action(a, b);
                                    break;
                                case "/":
                                    Delet delet = new Delet();
                                    delet.Action(a, b);
                                    break;
                            }
                        } else {
                            System.out.println("Mistake. No operation was enter");
                            break;
                        }
                    } else {
                        System.out.println("Mistake. No number was enter");
                        break;
                    }
                    System.out.println("Enter 1 for working with operations and 0 for exit");
                    j = scan.nextInt();
                }
                if (j != 1 && j != 0) {
                    System.out.println("Mistake. Wrong number was enter");
                    System.out.println("Program done.");
                } else {
                    System.out.println("No number was enter. Program done.");
                }
            }
        }
    }
}