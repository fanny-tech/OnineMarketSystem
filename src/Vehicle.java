public class Vehicle {
    String brand;
    int rentalprice;


    public Vehicle(String brand, int rentalprice){
        this.brand=brand;
        this.rentalprice=rentalprice;

    }

    public double calculateCost(int days){
        return rentalprice * days;


    }
}
