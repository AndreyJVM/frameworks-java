import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertSame;

public class AssertSameTestDemo {

    @Test(description = "assertSame() demo")
    public void assertSameTestDemo() {
        final String actual = new String("Hello world!");
        final String expected = actual;

        assertSame(actual, expected);
    }
}