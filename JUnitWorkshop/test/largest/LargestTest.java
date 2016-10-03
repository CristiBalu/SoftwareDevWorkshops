
package largest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sb720
 */
public class LargestTest {

    public LargestTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testOrder(){
        assertEquals (9, Largest.largest (new int [] {8 ,9 ,7}));
        assertEquals (9, Largest.largest (new int [] {7 ,8 ,9}));
    }

    @Test
    public void testEmpty () {
        try {
            Largest . largest ( new int [] {});
            fail (" Should have thrown an exception ");
        } catch ( RuntimeException e) {
            assertTrue ( true );
        }
    }

    @Test
    public void testOne () {
        assertEquals (1, Largest . largest ( new int [] {1}));
    }

    @Test
    public void testNegative (){
        int [] negList = new int [] {-9, -8, -7};
        assertEquals (-7, Largest . largest ( negList ));
    }

}