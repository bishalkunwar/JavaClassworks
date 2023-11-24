public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private int gas;

    // Constructor to initialize car properties
    public Car(String brand, String model, int year, String color, double price, int gas) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.gas = gas;
    }

    // Method to honk and display car information
    public void honk() {
        System.out.println("Tuut tuut! Car Information:");
        System.out.println("Brand: " + brand + ", Model: " + model +
                ", Year: " + year + ", Color: " + color +
                ", Price: $" + price + ", Gas: " + gas + " litres");
    }

    // Method to simulate a race for a specified number of turns
    public void race(int turns) {
        for (int turn = 1; turn <= turns; turn++) {
            System.out.println("\nRace Turn: " + turn);
            System.out.println("----------------------------");

            int gasConsumption = calculateGasConsumption();
            gas -= gasConsumption;

            System.out.println(brand + " has the gas remaining at turn " + turn + ": " + gas + " litres");
        }
    }

    // Helper method to calculate gas consumption based on car properties
    private int calculateGasConsumption() {
        int baseGasConsumption = 5;
        int yearDifference = 2023 - year;
        int extraGasConsumption = Math.max(0, yearDifference - 1);

        return baseGasConsumption + extraGasConsumption;
    }

    public static void main(String[] args) {
        // Create an array of car objects
        Car[] cars = {
                new Car("Honda", "CR-V", 2023, "Red", 50000, 45),
                new Car("Ford", "F-150", 2020, "Black", 25000, 30),
                new Car("BMW", "X5", 2022, "Green", 60000, 65),
                new Car("Mazda", "CX-5", 2019, "White", 15000, 60),
                new Car("Audi", "Q7", 2018, "Silver", 52000, 47),
                new Car("Kia", "Forte", 2020, "Blue", 21000, 56)
        };

        // Invoke honk method for each car and display information
        for (Car car : cars) {
            car.honk();
            System.out.println(); // Add a new line for clarity
        }

        // Simulate a race for each car over 7 turns
        for (Car car : cars) {
            car.race(7);
        }
    }
}
