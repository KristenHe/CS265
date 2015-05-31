import junit.framework.*;

public class gIntTest extends TestCase {

    private gInt sum1, sum2;
    private gInt prod1, prod2;
    private gInt normN;

    public static Test suite() {
        return new TestSuite(gIntTest.class);
    }

    protected void setUp() {
        sum1 = new gInt(2, 3);
        sum2 = new gInt(5, 4);
        prod1 = new gInt(4, 2);
        prod2 = new gInt(5, 8);
        normN = new gInt(9, 2);
    }

    public gIntTest(String name) {
        super(name);
    }

    public void testAdd() {
        gInt checkAdd = new gInt(7, 7);
        assertNotNull(checkAdd);

        gInt sum = sum1.add(sum2);
        assertNotNull(sum);
        assertEquals(sum.real(), checkAdd.real());
				assertEquals(sum.imag(), checkAdd.imag());
    }

    public void testMultiply() {
        gInt checkMult = new gInt(4, 42);
        assertNotNull(checkMult);

        gInt prod = prod1.multiply(prod2);
        assertNotNull(prod);
        assertEquals(prod.real(), checkMult.real());
				assertEquals(prod.imag(), checkMult.imag());
    }

    public void testNorm() {
				float checkNormal = (float)Math.sqrt(85);
        assertNotNull(checkNormal);

        float normalN = normN.norm();
        assertNotNull(normalN);
        assertEquals(normalN, checkNormal);
    }

    public static void main() {
        String[] caseName = { gIntTest.class.getName() };
        junit.textui.TestRunner.main(caseName);
    }
}
