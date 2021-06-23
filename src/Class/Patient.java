package Class;

import java.io.Serializable;

public class Patient implements Serializable {
    private String surname;
    private int age;
    private String City;
    private String idNumber;
    private int vaccineType;

    public Patient(String surname, int age, String city, String idNumber, int vaccineType) {
        this.surname = surname;
        this.age = age;
        City = city;
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
}
