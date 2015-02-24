package com.ohnana.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jakobgaardandersen
 */
public class FacadeTest {
    
    @Test
    public void testSingleton() {
        Facade fa1 = Facade.getFacade();
        Facade fa2 = Facade.getFacade();
        assertEquals(fa1, fa2);
    }
    
}
