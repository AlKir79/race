package car;

import java.lang.annotation.Target;

public class Car {
    private Part part[];

    public Car(Part[] part) {
        this.part = part;
    }

    public Car(Engine engine, Transmission transmission,Wheels wheels) {
        this.part=new Part[]{engine,transmission,wheels};
    }

    public void addPart(Part part){

    }
    public void repairPart(Part part){

    }
}
