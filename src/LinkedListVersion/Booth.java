package LinkedListVersion;

import java.io.Serializable;

/**
 * Make Booth class Serializable for Save Data as Objects
 */
public class Booth implements Serializable {
    private String firstName;

    /**
     * Booth Class Constructor
     * @param firstName String
     */
    public Booth(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
