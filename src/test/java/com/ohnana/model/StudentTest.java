package com.ohnana.model;

import static org.hamcrest.CoreMatchers.is;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jakobgaardandersen
 */
public class StudentTest {
    
    @Test
    public void testStudentClass() {
        String name = "Damjan Filipovic";
        Student student = new Student(name);

        assertThat(student.getName(), is(name));      
        
        
    }
    
}
