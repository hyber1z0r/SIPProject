package com.ohnana.sipproject;

import com.ohnana.model.ITeacher;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jakobgaardandersen
 */
public class HelloTest {
    
    private Hello hello;
    
    @Before
    public void setup() {
        hello = new Hello();
    }
    
    @Test
    public void testCodeCoverage() {
        assertEquals("Hello", hello.getHello());
    }
    
  
    
  
}
