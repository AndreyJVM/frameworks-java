import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Тест для класса Triangle проверяет стандартные комбинации существующих треугольников
 * - треугольник?
 * - равнобедренынй?
 * - равносторонний?
 * - не треугольник?
 */

/* Аннотоция @Test можно указывать как перед классом так и перед каждым отдельным классом, при этом варианте
 будут запущены только тесты с анотацией @Test */
public class TriangleTest {
    // В первую очередь рассмотрим description она помогает добавить описание теста
    // А также priority помогает порядок выполнения тестов
    // C помощью enabled мы можем отключать выполнение теста указал false
    @Test (description = "Check input is triangle", priority = 0, enabled = true)
    public void triangleTest() {
        String result = Triangle.isTriangle("4 5 6");
        Assert.assertEquals(result, Triangle.TRIANGLE, "Input is triangle");
    }

    @Test (description = "Check input is equilateral triangle", priority = 1, enabled = false)
    public void equilateralTriangleTest() {
        String result = Triangle.isTriangle("4 4 4");
        Assert.assertEquals(result, Triangle.EQUILATERAL, "Input is equilateral triangle");
    }

    @Test (description = "Check input is isosceles triangle", priority = 2, enabled = true)
    public void isoscelesTriangleTest() {
        String result = Triangle.isTriangle("4 6 6");
        Assert.assertEquals(result, Triangle.ISOSCELES, "Input is isosceles triangle");
    }

    @Test (description = "Check input is not triangle", priority = 3, enabled = true)
    public void noTriangleTest() {
        String result = Triangle.isTriangle("4 5 20");
        Assert.assertEquals(result, Triangle.NOT_TRIANGLE, "Input is not triangle");
    }
}