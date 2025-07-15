package lesson7Home;

public class Car {
    private String model;
    private Manufacturer manufacturer;
    private int productionYear;
    private double engineSize;
    private String fuelType;
    private int price;



    public Car(String model, Manufacturer manufacturer, int productionYear, double engineSize, String fuelType, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.price = price;
    }


    public String getFuelType() {
        return fuelType;
    }

    public double getPrice() {
        return price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer=" + manufacturer +
                ", productionYear=" + productionYear +
                ", engineSize=" + engineSize +
                ", fuelType='" + fuelType + '\'' +
                ", price=" + price +
                '}';
    }
}


