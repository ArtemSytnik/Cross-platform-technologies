import org.junit.Test;
import MyPackage.*;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void acrostic() {
        System.err.println("Running testAcrostic...");
        String result = MyClass.acrostic(new String[] {"fnord", "polly", "tropism"});
        assertEquals("Correct value", "foo", result);
    }
}
