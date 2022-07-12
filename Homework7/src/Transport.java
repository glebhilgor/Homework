public class Transport {
    public int power;
    public int maxSpeed;
    public int weight;
    public String model;
    public double kWt;

    public Transport() {
    }

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model=" + model +
                ", kWt=" + kWt + '\'' +
                '}';
    }
    public double kWt() {
        kWt = power * 0.75;
        return kWt;
    }
}