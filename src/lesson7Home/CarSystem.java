
package lesson7Home;

public class CarSystem {
    public static void main(String[] args) {


        Manufacturer audi = new Manufacturer("Audi",  "Germany");
        Manufacturer mercedes = new Manufacturer("Mercedes-Benz",  "Germany");


        Car audiRS8 = new Car("RS8", audi, 2021, 5.2, "Petrol", 150000);
        Car mercedesS500 = new Car("S500", mercedes, 2024, 4.0, "Petrol", 200000);
        Car mercedesC200 = new Car("C200", mercedes, 2023, 2.0, "Diesel", 100000);


        System.out.println("=== Avtomobil Kataloqu ===");
        System.out.println("------------------------------------------------------------------");
        System.out.println(audiRS8);
        System.out.println(mercedesS500);
        System.out.println(mercedesC200);
        System.out.println("------------------------------------------------------------------");


        System.out.println("\n=== Diesel Yanacaqlı Avtomobillər ===");
        System.out.println("------------------------------------------------------------------");
        if (audiRS8.getFuelType().equalsIgnoreCase("Diesel")) {
            System.out.println(audiRS8);
        }
        if (mercedesS500.getFuelType().equalsIgnoreCase("Diesel")) {
            System.out.println(mercedesS500);
        }
        if (mercedesC200.getFuelType().equalsIgnoreCase("Diesel")) {
            System.out.println(mercedesC200);
        }
        System.out.println("------------------------------------------------------------------");


        System.out.println("\n=== Alman İstehsalı Avtomobillər ===");
        System.out.println("------------------------------------------------------------------");
        if (audiRS8.getManufacturer().getCountry().equalsIgnoreCase("Germany")) {
            System.out.println(audiRS8);
        }
        if (mercedesS500.getManufacturer().getCountry().equalsIgnoreCase("Germany")) {
            System.out.println(mercedesS500);
        }
        if (mercedesC200.getManufacturer().getCountry().equalsIgnoreCase("Germany")) {
            System.out.println(mercedesC200);
        }
        System.out.println("------------------------------------------------------------------");


        System.out.println("\n=== Ən Bahalı Avtomobil ===");
        System.out.println("------------------------------------------------------------------");

        Car mostExpensiveCar = audiRS8;

        if (mercedesS500.getPrice() > mostExpensiveCar.getPrice()) {
            mostExpensiveCar = mercedesS500;
        }
        if (mercedesC200.getPrice() > mostExpensiveCar.getPrice()) {
            mostExpensiveCar = mercedesC200;
        }

        System.out.println(mostExpensiveCar);
        System.out.println("------------------------------------------------------------------");
    }
}
