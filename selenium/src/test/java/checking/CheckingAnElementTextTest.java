package checking;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class CheckingAnElementTextTest {
    private WebDriver driver;
    private static final String GOOGLE_URL = "https://www.google.ru/";

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(GOOGLE_URL);
    }

    @Test
    public void testElementText() {
        WebElement message = driver.findElement(By.id("message"));
        String messageText = message.getText();
        assertEquals("Click on me and my color will change", messageText);
        WebElement area = driver.findElement(By.id("area"));
        assertEquals("Div`s Text\nSnap`s Text", area.getText());
    }
}