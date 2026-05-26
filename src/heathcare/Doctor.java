package heathcare;

class Doctor extends Person {
    private String specialization;

    public Doctor( String name, int age, String email,String location) {
        super( name,age,email,location);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("EMAIL:"+ email);
        System.out.println("LOCATION:"+ location);
    }
}