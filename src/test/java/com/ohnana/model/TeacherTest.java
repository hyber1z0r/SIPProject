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
public class TeacherTest {

    public Mockery context = new JUnitRuleMockery();

    @Test
    public void testTeacherClass() {
        String name = "Anders Kalhauge";
        String initials = "aka";
        Teacher teacher = new Teacher(name, initials);

        assertThat(teacher.getName(), is(name));
        assertThat(teacher.getInitials(), is(initials));
    }

}
