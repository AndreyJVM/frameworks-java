package engineSPI;

import org.junit.platform.engine.*;
import org.junit.platform.engine.support.descriptor.EngineDescriptor;

public class MyCustomEngine implements TestEngine {

    public static final String ENGINE_ID = "my-custom-engine";
    @Override
    public String getId() {
        return ENGINE_ID;
    }

    @Override
    public TestDescriptor discover(EngineDiscoveryRequest engineDiscoveryRequest, UniqueId uniqueId) {
        return new EngineDescriptor(uniqueId, "My test");
    }

    @Override
    public void execute(ExecutionRequest executionRequest) {
        TestDescriptor rootTestDescription = executionRequest.getRootTestDescriptor();
        executionRequest.getEngineExecutionListener().executionStarted(rootTestDescription);
    }
}