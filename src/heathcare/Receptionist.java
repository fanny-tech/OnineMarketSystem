package heathcare;

class Receptionist extends Person {

    Receptionist(String name,int age,String email) {
        super( name, age, email, );
    }

    void registerPatient() {
        System.out.println(STR."\{name} registered a patient");
    }

    public void displayInfo() {
    }
}
