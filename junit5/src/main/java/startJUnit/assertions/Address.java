package startJUnit.assertions;

public class Address {

    private final String lastName;
    private final String firstName;

    public Address(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}