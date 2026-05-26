package heathcare;

class Pharmacist extends Person {
    private String medicine;

    public Pharmacist( String name, int age, String email,String location) {
        super(name, age,email,location);
        this.medicine = medicine;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pharmacist ID: " + id);
        System.out.println("Pharmacist Name: " + name);
        System.out.println("Medicine Given: " + medicine);
        System.out.println("---------------------------");
    }
}