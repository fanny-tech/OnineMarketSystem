public class Car extends Vehicle{

    public Car(String brand, int rentalprice) {
       super( brand  , rentalprice );
    }

    @Override
    public double calculateCost(int days) {
        return super.calculateCost(days);


    }
}