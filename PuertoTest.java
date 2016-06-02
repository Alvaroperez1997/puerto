
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test002()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Pepe", "AAA");
        Cliente cliente2 = new Cliente("Alvaro", "SSS");
        Cliente cliente3 = new Cliente("Alex", "DDD");
        Cliente cliente4 = new Cliente("Pedro", "FFF");
        Velero velero1 = new Velero(2, "ZZZ", 10, 1963);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(1500, "XXX", 50, 1996);
        Yate yate1 = new Yate(5, 1600, "CCC", 60, 2005);
        Velero velero2 = new Velero(3, "VVV", 5, 1995);
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(5, cliente2, embarcac1));
        puerto1.verEstado();
        assertEquals(-1, puerto1.liquidarAlquiler(3), 0.1);
        assertEquals(452500, puerto1.liquidarAlquiler(1), 0.1);
    }

    @Test
    public void test003()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Pepe", "AAA");
        Cliente cliente2 = new Cliente("Alvaro", "SSS");
        Cliente cliente3 = new Cliente("Alex", "DDD");
        Cliente cliente4 = new Cliente("Pedro", "FFF");
        Velero velero1 = new Velero(2, "ZZZ", 10, 1963);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(1500, "XXX", 50, 1996);
        Yate yate1 = new Yate(5, 1600, "CCC", 60, 2005);
        Velero velero2 = new Velero(3, "VVV", 5, 1995);
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(5, cliente2, embarcac1));
        puerto1.verEstado();
        assertEquals(-1, puerto1.liquidarAlquiler(3), 0.1);
        assertEquals(452500, puerto1.liquidarAlquiler(1), 0.1);
    }
    
    @Test
    public void test001()
    {
        Puerto puerto2 = new Puerto();
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(125, "0000AAA", 12, 1972);
        Yate yate1 = new Yate(3, 125, "111BBB", 19, 1980);
        Velero velero1 = new Velero(2, "2222ZZZ", 12, 2015);
        puerto2.verEstado();
        Cliente cliente1 = new Cliente("sandra", "123890P");
        Cliente cliente2 = new Cliente("sara", "5677890Y");
        Cliente cliente3 = new Cliente("ana", "54689657p");
        Cliente cliente4 = new Cliente("maria", "56778'77y");
        Cliente cliente5 = new Cliente("tino", "5656897T");
        puerto2.verEstado();
        assertEquals(0, puerto2.addAlquiler(1, cliente1, embarcac1));
        puerto2.verEstado();
        puerto2.verEstado();
        puerto2.verEstado();
        assertEquals(1, puerto2.addAlquiler(4, cliente2, yate1));
        assertEquals(39160, puerto2.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto2.addAlquiler(5, cliente4, velero1));
    }
}

