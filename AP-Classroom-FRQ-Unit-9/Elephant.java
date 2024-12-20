public class Elephant extends Herbivore {
    private double tuskLength;

    public Elephant(String n, double t) {
        super("elephant", n);
        tuskLength = t;
    }

    public double getTuskLength() {
        return tuskLength;
    }

    public String toString() {
        return super.toString() + " with tusks " + tuskLength + " meters long";
    }
}