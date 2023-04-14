package JavaInterviewPreparation.GetterSetterExample;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetterSetterExampleTest {
    @Test
    public void checkModifiedMessage() {
        var gse = new GetterSetterExample();
        assertEquals("This is modified GetterSetterExample message", gse.getString());
    }
}