import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotSame;

public class AssertNotSameTestDemo {
    @Test(description = "assertNotSame() demo")
    public void assertNotSameTestDemo() {
        final String actual = new String("Hello world!");
        final String expected = new String("Hello world!");

        assertNotSame(actual, expected);
    }
}