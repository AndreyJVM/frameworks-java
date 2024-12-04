package startJUnit.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("simple")
public class SimpleTaggingTest {

    @Test
    @Tag("texes")
    public void testingTaxCalculation() {
        final int actual = 2;
        assertEquals(2, actual);
    }
}