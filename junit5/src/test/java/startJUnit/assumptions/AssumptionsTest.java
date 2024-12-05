package startJUnit.assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsTest {

    @Test
    public void assumeTrueTest() {
        assumeTrue(false);
        fail("Test 1 failed");
    }

    @Test
    public void assumeFalseTest() {
        assumeFalse(this::getTrue);
        fail("Test 2 failed");
    }

    private boolean getTrue () {
        return true;
    }

    @Test
    public void assumingThatTrue() {
        assumingThat(false, () -> fail("Test 3 failed"));
    }
}
