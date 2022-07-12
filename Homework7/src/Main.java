public class Main {
    public static void main(String[] args) {

        Passanger car = new Passanger(215, 220, 1815, "Hummer", 4, 28, "Offroad", 5);
        car.kWt();
        System.out.println(car.toString());
        car.distance();
        car.gas();

        System.out.println("------------");

        Cargo truck = new Cargo(800, 140, 9315, "Peterbilt", 10, 41, 8000);
        truck.kWt();
        System.out.println(truck.toString());
        truck.load();

        System.out.println("-----------");

        Civilian plane = new Civilian(4100, 980, 15000, "Embraer", 32, 6000, 150, false);
        plane.kWt();
        System.out.println(plane.toString());
        plane.load();

        System.out.println("-------------");

        Military aircraft = new Military(3650, 1800, 5500, "F-22 Raptor", 16, 2000, 10, true);
        aircraft.kWt();
        System.out.println(aircraft.toString());
        aircraft.launch();
        aircraft.eject();
    }
}
