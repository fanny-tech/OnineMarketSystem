package heathcare;

class Receptionist extends Person {

    Receptionist(int id, String name) {
        super(id, name);
    }

    void registerPatient() {
        System.out.println(STR."\{name} registered a patient");
    }

    public void displayInfo() {
    }
}
