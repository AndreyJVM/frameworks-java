package startJUnit.thirdPartyExtensions;

import org.junit.jupiter.api.extension.*;

public class SpringExtension implements BeforeAllCallback, AfterAllCallback,
        TestInstancePostProcessor, BeforeEachCallback, AfterEachCallback,
        BeforeTestExecutionCallback, AfterTestExecutionCallback, ParameterResolver {

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        // implementation
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        // implementation
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        // implementation
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        // implementation
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        // implementation
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        // implementation
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return false;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return null;
    }

    @Override
    public void postProcessTestInstance(Object o, ExtensionContext extensionContext) throws Exception {
        // implementation
    }
}