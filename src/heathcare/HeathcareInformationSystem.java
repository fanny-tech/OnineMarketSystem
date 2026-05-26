package heathcare;

import java.util.ArrayList;

public class HealthcareInformationSystem {

    public static void main(String[] args) {

        // Java Collections
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Pharmacist> pharmacists = new ArrayList<>();
        ArrayList<Receptionist> receptionists = new ArrayList<>();

        // Add Patients
        patients.add(new Patient(1, "Eric", 22, "Malaria"));
        patients.add(new Patient(2, "Alice", 20, "Typhoid"));

        // Add Doctors
        doctors.add(new Doctor(101, "Dr John", 45, "Cardiology"));
        doctors.add(new Doctor(102, "Dr Sarah", 38, "Dentist"));

        // Add Pharmacists
        pharmacists.add(new Pharmacist(201, "Peter", 30, "Paracetamol"));

        // Add Receptionists
        receptionists.add(new Receptionist(301, "Grace", 25, "Morning"));

        // Display Patients
        System.out.println("===== PATIENTS =====");
        for (Patient p : patients) {
            p.displayInfo();
        }

        // Display Doctors
        System.out.println("===== DOCTORS =====");
        for (Doctor d : doctors) {
            d.displayInfo();
        }

        // Display Pharmacists
        System.out.println("===== PHARMACISTS =====");
        for (Pharmacist ph : pharmacists) {
            ph.displayInfo();
        }

        // Display Receptionists
        System.out.println("===== RECEPTIONISTS =====");
        for (Receptionist r : receptionists) {
            r.displayInfo();
        }
    }
}