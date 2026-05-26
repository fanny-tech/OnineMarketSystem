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
        doctors.add(new Doctor("karisa", 56, "karis@gmail.com", "Cardiology"));
        doctors.add(new Doctor("keven", 45, "kev@gmail.com", "Dentist"));

        // Add Pharmacists
        pharmacists.add(new Pharmacist("keza", 35, "kez@gmail.com", "Paracetamol"));

        // Add Receptionists
        receptionists.add(new Receptionist("alice",33,"alic@gmail.com");


