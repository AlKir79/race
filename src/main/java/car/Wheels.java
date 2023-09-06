package car;

public class Wheels extends Part {
    private int size;     //размер
    private int friction; //сцепление

    public Wheels(int size, int friction) {
        super("Conti",15,400);
        this.size = size;
        this.friction = friction;
    }

    public Wheels(String name, double wear, double price, int size, int friction) {
        super(name, wear, price);
        this.size = size;
        this.friction = friction;
    }

    public Wheels() {
        super("Conti",15,400);
        this.size = 17;
        this.friction = 100;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFriction() {
        return friction;
    }

    public void setFriction(int friction) {
        this.friction = friction;
    }
}
