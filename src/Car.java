

public class Car {

    private Double price;
    private Double mileage;
    private Persistence persistence;

    public Car(Double price, Double mileage, Persistence persistence) {
        this.price = price;
        this.mileage = mileage;
        this.persistence = persistence;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public Persistence getPersistence() {
        return persistence;
    }

    public void setPersistence(Persistence persistence) {
        this.persistence = persistence;
    }


    private Double depreciationByYear() {
        return price/5;
    }

    public Double depreciationByMonth() {
        return depreciationByYear()/12;
    }

    public void save() {
        getPersistence().save(this);
    }

    public void saveCarBasedOnDepreciation() {
        if (depreciationByMonth() > 600.00 && depreciationByMonth() < 1200.00 )
            getPersistence().save(this);
    }

    public Boolean wheleedCar() {
        return getMileage() > 100000.00;
    }

}
