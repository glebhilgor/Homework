public class Main {
    public static void main(String[] args) {
        Car tesla = new Car(296, 100000, "Tesla Model X");
        tesla.startEngine();

        Car rivian = new Car(280, 67000, "Rivian");
        rivian.startEngine();

        Car audi = new Car(310, 145000, "E-Tron");
        audi.startEngine();
    }
}

