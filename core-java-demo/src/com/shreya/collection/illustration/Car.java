package src.com.shreya.collection.illustration;

public class Car {
    public String brand;
    public String model;
    public int manufacturingYear;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }
}
