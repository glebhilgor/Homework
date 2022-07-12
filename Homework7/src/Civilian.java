import java.util.Scanner;

public class Civilian extends Air {

    private int passQuantity;
    boolean businessClass;

    public Civilian(int power, int maxSpeed, int weight, String model, int wingsLength, int stripLength, int passQuantity, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingsLength, stripLength);
        this.passQuantity = passQuantity;
        this.businessClass = businessClass;
    }

    public int getPassQuantity() {
        return passQuantity;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    @Override
    public String toString() {
        return super.toString() + "Civilian{" +
                "passQuantity=" + passQuantity +
                ", businessClass=" + businessClass +
                ", kWt=" + kWt + '}';
    }

    public void load() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the passengers quantity");
        int passengers = scanner.nextInt();
        if (passengers <= passQuantity) {
            System.out.println("The plane if fully loaded");
        } else {
            System.out.println("The plane is too small");

        }
    }
}

