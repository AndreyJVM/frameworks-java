package startJUnit.nested;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
public class InnerClassOne {

    @BeforeEach
    public void setup2 () {
        System.out.println("Setup 2");
    }

    @Test
    public void innerTest1 () {
        System.out.println("Test 2");
    }
}