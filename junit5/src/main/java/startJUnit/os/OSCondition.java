package startJUnit.os;

import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.AnnotationUtils;
import startJUnit.conditionalExtensionPoints.ExecutionCondition;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.Optional;

public class OSCondition implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult conditionEvaluationResult(ExtensionContext context) {
        Optional<AnnotatedElement> element = context.getElement();
        ConditionEvaluationResult out = ConditionEvaluationResult.enabled("@DisabledOnOS is not present");
        Optional<DisabledOnOs> disabledOnOs = AnnotationUtils.findAnnotation(element, DisabledOnOs.class);

        if (disabledOnOs.isPresent()) {
            OS myOS = OS.determine();
            if(Arrays.asList(disabledOnOs.get().value())
                    .contains(myOS)) {
                out = ConditionEvaluationResult.disabled("Test is disabled on " + myOS);
            } else {
                out = ConditionEvaluationResult.enabled("Test is not disabled on " + myOS);
            }
        }
        System.out.println("--> " + out.getReason().get());
        return out;
    }
}