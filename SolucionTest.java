package p2.examen;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SoucionTest {
    
    
    private Solucion s = new Solucion();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isCorrectProblemaTest() {
        String val="";
        
        val="abab";
        assertTrue("Resultado para '"+val+"':", s.problema(val));

        val="aba";
        assertTrue("Resultado para '"+val+"':", s.problema(val));


        val="gustavogustavogustavo";
        assertTrue("Resultado para '"+val+"':", s.problema(val));

        val="gustavogustavogustavog";
        assertTrue("Resultado para '"+val+"':", s.problema(val));



    }
    
    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
