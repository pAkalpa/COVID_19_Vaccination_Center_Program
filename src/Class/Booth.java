package Class;

public class Booth {
    private String firstName;
    private Patient patient;

    public Booth(String firstName, Patient patient) {
        this.firstName = firstName;
        this.patient = patient;
    }

    public String getPatientName() {
        return firstName;
    }

    public void setPatientName(String patientName) {
        this.firstName = patientName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
