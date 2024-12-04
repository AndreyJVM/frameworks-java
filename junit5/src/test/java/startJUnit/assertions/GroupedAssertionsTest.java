package startJUnit.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroupedAssertionsTest {

    @Test
    public void groupAssertions() {
        Address address = new Address("John", "Smith");
        // In a grouped assertion all assertions are executed, and any
        // failures will be reported together
        assertAll("address", () -> assertEquals("John",
                address.getFirstName()), () ->
                assertEquals("User", address.getLastName()));
    }
}