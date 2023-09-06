package car;

public abstract class Part {
    private String name;    // имя
    private double wear;    // износ
    private double price;   // цена

    public Part(){
        this.name = "";
        this.wear = 0;
        this.price = 0;
    }

    public Part(String name,double wear,double price){
        this.name = name;
        this.wear = wear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWear() {
        return wear;
    }

    public void setWear(double wear) {
        this.wear = wear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
