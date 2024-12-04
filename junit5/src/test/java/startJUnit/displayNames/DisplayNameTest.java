package startJUnit.displayNames;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A special test case")
public class DisplayNameTest {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
        // test
    }

    @Test
    @DisplayName("\uD83D\uDE02")
    void testWithDisplayNameContainingEmoji() {
        // test
    }
}