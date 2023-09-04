package model;


public class Car {
    private String model;
    private int manufactureYear;
    private int mileage;

    public Car(String model, int manufactureYear, int mileage) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", mileage=" + mileage +
                '}';
    }
}
