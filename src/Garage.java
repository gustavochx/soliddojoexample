import java.util.ArrayList;

public class Garage {

    private ArrayList<Car> cars;

    public Garage(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void storeInGarage(Car newCar) {
        getCars().add(newCar);
    }

    public Car retriveFromGarage(int index) {
        return getCars().get(index);
    }
}
