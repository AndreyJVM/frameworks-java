package newInJUnit.conditionalExtensionPoints;

import org.apiguardian.api.API;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;

import static org.apiguardian.api.API.Status.STABLE;

/**
 * The extension can be used to deactivate either all tests in a container (likely a class) or individual
 * tests. Example of this extension are provided in the section {@code Conditional Test Execution}.
 */

@API(status = STABLE, since = "5.0")
public interface ExecutionCondition extends Extension {
    ConditionEvaluationResult conditionEvaluationResult
            (ExtensionContext context);
}