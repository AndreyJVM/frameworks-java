package startJUnit.DI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/** Then, this parameter resolver can be used in a test,
 * declaring it as usual using the annotation {@code @ExtendWith}*/
public class DependencyInjectionTest {

    @ExtendWith(MyParameterResolver.class)
    @Test
    public void test(Object parameter) {
        System.out.println("My parameter " + parameter);
    }
}