import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AuxiliaryParametersTest {

    @Parameters("Temperature")
    @Test
    public void testNewYorkWeatherForecastForToday(int temperature) {
        System.out.println("New York Weather Forecast for Today - " + temperature + "\n");
    }

    @Parameters({"Name", "Temperature"})
    @Test
    public void testTwoParametersForDifferentClass(String name, int temperature) {
        System.out.println("Welcome " + name +
                ".\nNew York Weather Forecast for Today - " + temperature);
    }
}