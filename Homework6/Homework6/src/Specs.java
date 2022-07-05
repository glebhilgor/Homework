import java.util.Scanner;

public class Specs {
    public static void main(String[] args) {

        Computer apple = new Computer(16, 512, 16, "M1 Pro");
        System.out.println("Apple MacBook Pro");
        apple.printInfo();
        apple.switchOn();
        apple.switchOff();
    }
}
