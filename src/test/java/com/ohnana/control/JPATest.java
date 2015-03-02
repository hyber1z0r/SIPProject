package com.ohnana.control;

import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.Teacher;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jakobgaardandersen
 */
public class JPATest {
    
    private IJPAManager manager;
    
    @Before
    public void setup() {
        manager = new JPAManager(Persistence.createEntityManagerFactory("com.ohnana_SIPProject"));
        
    }
    
    @Test
    public void testInsertTeacher() {
        ITeacher t1 = new Teacher();
        ITeacher t2 = new Teacher();
        ITeacher t3 = new Teacher();
        manager.insertTeacher(t1);
        manager.insertTeacher(t2);
        manager.insertTeacher(t3);
       
    }
    
    
    
}
