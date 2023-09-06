package car;

public class CarFactory {
    public enum modelCar{
        Volga,
        Niva,
        Moskvich,
        Ghiguli
    }

    public Car createCar(modelCar model){
        Car car = null;
        switch (model) {
            case Volga:
                Engine Eng1 = new Engine("Chrysler", 100, 500, 143);
                Transmission Trans1 = new Transmission("RWD", 100, 400, 100);
                Wheels whe1 = new Wheels("Conti", 100, 200, 16, 100);
                car = new Car(Eng1,Trans1,whe1);
                break;
            case Niva:
                Engine Eng2 = new Engine("VAZ", 100, 500, 82);
                Transmission Trans2 = new Transmission("AWD", 100, 400, 100);
                Wheels whe2 = new Wheels("Баргузин", 100, 200, 16, 100);
                car = new Car(Eng2,Trans2,whe2);
                break;
        }
        return car;

        }


}
