package heathcare;

public abstract class Person {
    private String name;
    private int age;
    private String email;
    private String location;

    public Person(String name, int age, String email, String location) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.location = location;

    }

    public Person( String name,String email,String location) {
    }





    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayPatient() {
        System.out.println("EMAIL:" + email);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("LOCATION:" + location);
    }

    public abstract void displayInfo();
}

