import java.util.Random;

public class Car {
    public int Speed;
    public int Cost;
    static String Model;

    public Car(int speed, int cost, String model) {
        Speed = speed;
        Cost = cost;
        Model = model;
    }
    public Car() {

    }

    public int getSpeed() {
        return Speed;
    }

    public int getCost() {
        return Cost;
    }

    public String getModel() {
        return Model;
    }

    public void setSpeed(int speed) {
        this.Speed = speed;
    }

    public void setCost(int cost) {
        this.Cost = cost;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public static void startEngine() {
        try {
            offEngine();
            System.out.println("Car " + Model + " is started");
        } catch (Action e) {
            e.printStackTrace();
        }

    }
    public static void offEngine() throws Action {
        Random random = new Random();
        int x = random.nextInt(20);
        if (x%2==0) {
            throw new Action("Exception");
        }
    }
}
