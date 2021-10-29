package testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class funcionesTest {
    
    public funcionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class funciones.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 1;
        int b = 2;
        funciones instance = new funciones();
        int expResult = 3;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class funciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 5;
        int b = 2;
        funciones instance = new funciones();
        int expResult = 3;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class funciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 5;
        int b = 2;
        funciones instance = new funciones();
        int expResult = 10;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class funciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 21;
        int b = 3;
        funciones instance = new funciones();
        int expResult = 7;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
