package com.ohnana.control;

import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jakobgaardandersen
 */
public class JPATest {

    private IJPAManager manager;
    private List<ITeacher> teachers;

    @Before
    public void setup() {
        manager = new JPAManager(Persistence.createEntityManagerFactory("com.ohnana_SIPProject"));
        teachers = new ArrayList() {
            {
                add(new Teacher("Peter Lorensen", "pelo"));
                add(new Teacher("Anders Kalhauge", "aka"));
                add(new Teacher("Tobias Grundtvig", "tog"));
            }
        };
    }
    
    @After
    public void cleanUp() {
        for (ITeacher t : teachers) {
            manager.removeTeacher(t);
        }
    }

    @Test
    public void testInsertTeacher() {
        for (ITeacher t : teachers) {
            manager.insertTeacher(t);
        }
        List<ITeacher> ts = manager.getAllTeachers();
        assertEquals(ts.size(), 3);
    }

    @Test
    public void testInsertProposal() {
        // Getting all teachers, and inserting a new proposal
        List<ITeacher> allTeachers = manager.getAllTeachers();
        IProposal p1 = new Proposal("Android", "Learn about the android platform", allTeachers.get(0));
        manager.insertProposal(p1);
        List<IProposal> proposals = manager.getAllProposals();
        assertEquals(proposals.size(), 1);
    }

}
