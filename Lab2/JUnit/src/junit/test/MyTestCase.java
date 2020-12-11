package junit.test;
import junit.framework.TestCase;

import java.util.Vector;

public class MyTestCase extends TestCase {

    private Vector container;
    @Override
    protected void setUp() throws Exception {
        container = new Vector();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public Vector getContainer() {
        return container;
    }

    public void setContainer(Vector container) {
        this.container = container;
    }
}
