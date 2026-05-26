 public class Bike extends Vehicle {
     public Bike(String brand, int rentalprice) {

         super(brand, rentalprice);
     }

     @Override
     public double calculateCost(int days) {
         return (rentalprice *days)-10;
     }

     public void calculateCost(){
        System.out.println("bikes is addition");
    }
}