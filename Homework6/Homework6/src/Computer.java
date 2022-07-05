
import java.util.Random;
import java.util.Scanner;

public class Computer {

    int ram;
    int hdd;
    int cycle = 0;
    String cpu;
    boolean power = false;


    public Computer(int ram, int hdd, int cycle, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cycle = cycle;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Operational memory - " + ram);
        System.out.println("Processor - " + cpu);
        System.out.println("Hard drive - " + hdd);
        if (power == false) {
            System.out.println("Computer is off");
        } else {
            System.out.println("Computer is on");
        }
        System.out.println();
    }

    public void switchOn() {
        Random random = new Random();
        int num1 = random.nextInt(2);
        System.out.println("Enter the number from 0 to 1 ");
        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        if (power == false) {
            if (num1 == num2) {
                System.out.println("System switching on ");
                power = true;
            } else System.out.println("System switching off");
        } else System.out.println("Error");


    }

    public void switchOff() {
        Random random = new Random();
        int num1 = random.nextInt(2);
        System.out.println("Enter the number from 0 to 1");
        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        if (power == true) {
            if (num1 == num2) {
                System.out.println("System switching off");
                power = false;
                cycle++;
            } else System.out.println("System switching on");
        } else System.out.println("Error");

    }


}
