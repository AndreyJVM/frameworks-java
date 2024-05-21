import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

/**
 * Тест, заходит на главную поисковую страницу Google находит поиск по имени,
 * в поисковике вводим произвольный текст
 * сравниваем наш текст с тем, что отображается во вкладке
 * если они равны нашим ожиданиям значит тест проходит
 */

public class FirefoxGoogleSearchTest {
    private WebDriver driver;
    private static final String GOOGLE_URL = "https://www.google.ru/";

    @Before
    public void setUp() {
        //открываем браузер Firefox на весь экран и переходим на поисковую страницу Google
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(GOOGLE_URL);
    }

    @Test
    public void firefoxGoogleSearchTest() {
        //Находим поле ввода по имени
        WebElement element = driver.findElement(By.name("q"));
        //отчищаем поле ввода
        element.clear();
        //Текс по которому будем производить поиск
        String findTest = "Автоматизированное тестирование";
        //Вводим информацию, которую хотим найти
        element.sendKeys(findTest);
        //Кликаем на кнопку поиска
        element.submit();

        //Используем явное ожидание, ждём 10 секунд,
        //за это время startsWith() должен вернуть true
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase()
                        .startsWith(findTest.toLowerCase());
            }
        });

        assertEquals(findTest + " - Поиск в Google",
                driver.getTitle());
    }

    @After
    public void tearDown() throws Exception{
        //закрываем браузер
        driver.quit();
    }
}