package startJUnit.nested;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A stack test")
public class StackTest {

    @Test
    @DisplayName("is instantiated")
    public void isInstantiated() {}

    @Nested
    @DisplayName("when empty")
    class WhenNew {

        @Test
        @DisplayName("is empty")
        public void isEmpty() {
        }

        @Test
        @DisplayName("throws Exception when popped")
        public void throwsExceptionWhenPopped() {
        }

        @Test
        @DisplayName("throws Exception when peeked")
        public void throwsExceptionWhenPeeked() {
        }

        @Nested
        @DisplayName("after pushing an element")
        class AfterPushing {

            @Test
            @DisplayName("is it no longer empty")
            public void inNotEmpty() {
            }

            @Test
            @DisplayName("returns the element when popped")
            public void returnsTheElementWhenPopped() {
            }

            @Test
            @DisplayName("returns the element when peeked")
            public void returnsTheElementWhenPeeked() {
            }
        }
    }
}