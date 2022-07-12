import java.util.Scanner;

public class Cargo extends Land {
    private int loadCapacity;

    public Cargo(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Cargo(int power, int maxSpeed, int weight, String model, int wheels, int fuel, int loadCapacity) {
        super(power, maxSpeed, weight, model, wheels, fuel);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Cargo{" +
                "loadCapacity=" + loadCapacity +
                ", kWt=" + kWt + '}';
    }

    public void load() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight of your shipment");
        int cargo = scanner.nextInt();
        if (cargo <= loadCapacity) {
            System.out.println("Truck is fully loading");
        } else {
            System.out.println("Truck is smaller then shipment");

        }

    }
}