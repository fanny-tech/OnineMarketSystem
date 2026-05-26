package heathcare;

public class Appointment {

    private String patientName;
    private String doctorName;
    private String date;

    public Appointment(String patientName, String doctorName, String date) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    public void showAppointment() {

        System.out.println("Patient: " + patientName);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Date: " + date);
    }
}
