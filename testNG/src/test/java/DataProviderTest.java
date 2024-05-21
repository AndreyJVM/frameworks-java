import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Тестовый класс демонстрирующий работу провайдера данных, с использованием различного количества,
 * входных параметров.
 *
 * В примере перечисленны все базовые типы int, double, boolean и ссылочный тип String, так же возможно
 * передавать объекты.
 * */
public class DataProviderTest {

    @Test(description = "@DataProvider two parameters test", dataProvider = "dataProviderTwo")
    public void triangleDataProviderTwoParametersTest(String name, int age) {
        System.out.println("@DataProvider two parameters test");
        System.out.println("Name - " + name);
        System.out.println("Age - " + age + "\n");
    }

    @DataProvider(name = "dataProviderTwo")
    public Object[][] dataProviderTwo() {
        return new Object[][]{
                {"Andrey", 21},
                {"Voktor", 23},
                {"Vova", 31},
        };
    }

    @Test(description = "@DataProvider three parameters test", dataProvider = "dataProviderThree")
    public void triangleDataProviderThreeParametersTest(String name, String lastName, int age) {
        System.out.println("@DataProvider three parameters test");
        System.out.println("Name - " + name);
        System.out.println("Last name - " + lastName);
        System.out.println("Age - " + age + "\n");
    }

    @DataProvider(name = "dataProviderThree")
    public Object[][] dataProviderThree() {
        return new Object[][]{
                {"Andrey", "Vorobev", 21},
                {"Kostya", "Ivanov", 42},
                {"Mark", "Zuckerberg", 39},
                {"Ilon", "Mask", 52},
        };
    }

    @Test(description = "@DataProvider all parameters test", dataProvider = "dataProviderAll")
    public void triangleDataProviderAllParametersTest(String name, int age, double height, boolean haveCar) {
        System.out.println("@DataProvider all parameters test");
        System.out.println("Name - " + name);
        System.out.println("Height - " + height);
        System.out.println("Have a car - " + haveCar);
        System.out.println("Age - " + age + "\n");
    }

    @DataProvider(name = "dataProviderAll")
    public Object[][] dataProviderAll() {
        return new Object[][]{
                {"Andrey", 21, 174.4, false},
                {"Vova", 22, 184.4, false},
                {"Ilon", 52, 154.9, true},
                {"Mark", 39, 194.1, true},
        };
    }
}