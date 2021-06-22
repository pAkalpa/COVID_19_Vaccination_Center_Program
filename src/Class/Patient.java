package Class;

public class Patient {
    private String firstName;
    private String lastName;
    private int age;
    private String City;
    private String idNumber;
    private String vaccineType;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public Patient(String firstName, String lastName, int age, String city, String idNumber, String vaccineType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        City = city;
        this.idNumber = idNumber;
        this.vaccineType = vaccineType;
    }
}
