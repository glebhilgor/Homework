import java.util.Scanner;

public class Passanger extends Land {
    String bodyType;
    int passengersQauntity;
    private double distance;
    public double gas;

    public Passanger(int power, int maxSpeed, int weight, String model, int wheels, int fuel, String bodyType, int passengersQauntity) {
        super(power, maxSpeed, weight, model, wheels, fuel);
        this.bodyType = bodyType;
        this.passengersQauntity = passengersQauntity;
    }

    public Passanger(String bodyType, int passengersQauntity) {
        this.bodyType = bodyType;
        this.passengersQauntity = passengersQauntity;
    }

    @Override
    public String toString() {
        return super.toString() + "Passanger{" +
                "bodyType='" + bodyType + '\'' +
                ", passengersQuantity=" + passengersQauntity +
                ", kWt=" + kWt + '}';

    }

    public double distance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the moving time");
        double time = input.nextInt();
        distance = time * maxSpeed;
        System.out.println("During " + time + "hours, the car " + model + " was driving " + maxSpeed + "km/h, and the driven distance was " + distance);
        return distance;
    }

    public double gas() {
        double gas = this.distance / 100 * fuel;
        System.out.println(gas + "lt of fuel was burned");
        return fuel;
    }

}

