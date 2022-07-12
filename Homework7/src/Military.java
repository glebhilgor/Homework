public class Military extends Air {

    private boolean ejectionSys;
    int rockets;

    public Military(int power, int maxSpeed, int weight, String model, int wingsLength, int stripLength, int rockets, boolean ejectionSys) {
        super(power, maxSpeed, weight, model, wingsLength, stripLength);
        this.ejectionSys = ejectionSys;
        this.rockets = rockets;
    }

    @Override
    public String toString() {
        return super.toString() + "Military{" +
                "ejectionSys=" + ejectionSys +
                ", rockets=" + rockets +
                ", kWt=" + kWt + '}';
    }

    public void launch() {
        for (int a = 0; a < rockets; a++) {
            System.out.println("Rocket launched");
        }
        rockets = 0;
        System.out.println("Rockets empty");
        System.out.println();

    }

    public void eject() {
        if (ejectionSys == true) {
            System.out.println("The pilot was ejected");
        } else {
            System.out.println("The pilot was burned and dead");
        }
    }
}
