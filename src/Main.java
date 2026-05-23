import java.util.Scanner;
    public class  Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // --- Part 1: Hardcoded objects for 5 days ---
            Car car = new Car("Toyota", 50);
            Bike bike = new Bike("Yamaha", 20);

            System.out.println("=== Fixed Rental (5 days) ===");
            System.out.println(car.brand + " (Car) rental cost: $");
            System.out.println(bike.brand + " (Bike) rental cost: $");

            // --- Part 2: User input ---
            System.out.println("\n=== Enter Vehicle Details ===");

            System.out.print("Enter vehicle type (Car/Bike): ");
            String type = scanner.nextLine();

            System.out.print("Enter brand: ");
            String brand = scanner.nextLine();

            System.out.print("Enter rental price per day: ");
            double price = scanner.nextDouble();

            System.out.print("Enter number of days: ");
            int days = scanner.nextInt();

            Vehicle vehicle;
            int rentalprice = 0;
            if (type.equalsIgnoreCase("Car")) {
                vehicle = new Car(brand, rentalprice);
            } else {
                vehicle = new Bike(brand, rentalprice);
            }

            System.out.println("\n=== Rental Cost Summary ===");
            System.out.println("Brand: " + vehicle.brand);
            System.out.println("Type: " + type);
            System.out.println("Days: " + days);
            System.out.println("Total Cost: $" );

            scanner.close();
        }
    }