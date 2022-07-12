public class Air extends Transport {
    private int wingsLength;
    private int stripLength;

    public Air(){

    }
    public Air(int power, int maxSpeed, int weight, String model, int wingsLength, int stripLength) {
        super(power, maxSpeed, weight, model);
        this.wingsLength = wingsLength;
        this.stripLength = stripLength;
    }
    public int getWingsLength() {
        return wingsLength;
    }
    public int getStripLength() {
        return stripLength;
    }

    @Override
    public String toString() {
        return super.toString() + "Air{" +
                "wingsLength=" + wingsLength +
                ", stripLength=" + stripLength +
                ", kWt=" + kWt + '}';
    }
}
