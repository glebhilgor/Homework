public class Land extends Transport {
    private int wheels;
    public int fuel;

    public Land() {
    }

    public Land(int power, int maxSpeed, int weight, String model, int wheels, int fuel) {
        super(power,maxSpeed,weight,model);
        this.wheels = wheels;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return super.toString() + "Land{" +
                "wheels='" + wheels + '\'' +
                ", fuel=" + fuel +
                ", kWt=" + kWt + '}';
    }
}
