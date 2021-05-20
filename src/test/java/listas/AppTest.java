package listas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import listas.enlazada.Lista;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private Lista list;

    public void initScenario() {
        list = new Lista();
    }

    // @Before
    // public void before(){
    // System.out.println("before()");
    // }

    // @After
    // public void after(){
    // System.out.println("after()");
    // }

    @Test
    public void testAdd() {
        int posicion = 0;
        int elemento = 5;
        initScenario();
        int originalSize = list.getNumeroElementos();
        list.AgregarPrimero(elemento);
        int newSize = list.getNumeroElementos();
        // assertTrue(condition);
        assertTrue("Test Add", checkSize(originalSize, newSize - 1) && list.Obtener(posicion) == elemento); //
        // assertEquals(expected, actual);
    }

    @Test
    public void testGet() {

        int posicion = 0;
        int elemento = 5;
        initScenario();
        list.AgregarPrimero(elemento);

        int originalSize = list.getNumeroElementos();
        list.Obtener(posicion);
        int newSize = list.getNumeroElementos();
        // assertTrue(condition);
        assertTrue("Test Add", checkSize(originalSize, newSize) && list.Obtener(posicion) == elemento); //
        // assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {

        int posicion = 0;
        int elemento = 5;
        initScenario();
        list.AgregarPrimero(elemento);

        int originalSize = list.getNumeroElementos();
        list.Remover(posicion);
        int newSize = list.getNumeroElementos();
        assertTrue("Test Add", checkSize(originalSize - 1, newSize));

    }

    private boolean checkSize(int originalSize, int newSize) {
        return originalSize == newSize;
    }
}
