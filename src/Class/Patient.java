package Class;

import java.io.Serializable;

/**
 * Make Patient class Serializable for Save Data as Objects
 */
public class Patient extends Booth implements Serializable {
    private String surname;
    private int age;
    private String City;
    private String idNumber;
    private int vaccineType;

    /**
     * Patient Class Constructor
     * @param firstName String
     * @param surname String
     * @param age integer
     * @param city String
     * @param idNumber String
     * @param vaccineType integer
     */
    public Patient(String firstName,String surname, int age, String city, String idNumber, int vaccineType) {
        super(firstName);
        this.surname = surname;
        this.age = age;
        this.City = city;
        this.idNumber = idNumber;
        this.vaccineType = vaccineType;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(int vaccineType) {
        this.vaccineType = vaccineType;
    }

    public void showPatientInfo() {
        String vaccineName = switch (vaccineType) {
            case 1 -> "AstraZeneca";
            case 2 -> "Sinopharm";
            case 3 -> "Pfizer";
            default -> "";
        };
        System.out.println("First Name: " + super.getFirstName() + "\nSurname: " + surname + "\nAge: " + age + "\nCurrent Living City: " + City + "\nNIC\\Passport No: " + idNumber + "\nVaccine Type: " + vaccineName + "\n");
    }
}
