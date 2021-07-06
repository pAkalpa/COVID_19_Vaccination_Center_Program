package Class;

import java.io.Serializable;

/**
 * Make Booth class Serializable for Save Data as Objects
 */
public class Booth implements Serializable {
    private String firstName;
    private Patient patient;

    /**
     * Booth Class Constructor
     * @param firstName String
     * @param patient object of Patient class
     */
    public Booth(String firstName, Patient patient) {
        this.firstName = firstName;
        this.patient = patient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
