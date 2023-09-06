package car;

public class Engine extends Part{
    private double power;  //мощность

    public Engine(double power) {
        super("Chrysler",10,1000);
        this.power = power;
    }

    public Engine(String name, double wear, double price, double power) {
        super(name, wear, price);
        this.power = power;
    }

    public Engine() {
        super("Chrysler",10,1000);
        this.power = 180;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
