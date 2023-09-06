package car;

public class Transmission extends Part {
    private double state; //состояние

    public Transmission(String name, double wear, double price, double state) {
        super(name, wear, price);
        this.state = state;
    }

    public Transmission(double state) {
        super("AWD",0.95,100);
        this.state = state;
    }

    public Transmission(){
        super("AWD",0.95,100);
        this.state = 100;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }
}
