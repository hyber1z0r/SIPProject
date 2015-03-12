package com.ohnana.control;

import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author jakobgaardandersen
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JPATest {

    private IJPAManager manager;
    private List<ITeacher> teachers;

    @Before
    public void setup() {
        manager = new JPAManager(Persistence.createEntityManagerFactory("com.ohnana_SIPProject_TEST"));
        teachers = new ArrayList() {
            {
                add(new Teacher("Peter Lorensen", "pelo"));
                add(new Teacher("Anders Kalhauge", "aka"));
                add(new Teacher("Tobias Grundtvig", "tog"));
            }
        };
    }

    @Test
    public void test_A_InsertTeacher() throws Exception {
        List<ITeacher> oldTs = manager.getAllTeachers();
        for (ITeacher t : teachers) {
            manager.insertTeacher(t);
        }
        List<ITeacher> ts = manager.getAllTeachers();
        assertEquals(ts.size(), oldTs.size() + 3);
    }

    @Test
    public void test_C_InsertProposal() throws Exception {
        // Getting all teachers, and inserting a new proposal
        List<ITeacher> allTeachers = manager.getAllTeachers();
        List<IProposal> oldProposals = manager.getAllProposals();
        IProposal p1 = new Proposal("Android", "Learn about the android platform", allTeachers.get(0));
        manager.insertProposal(p1);
        List<IProposal> proposals = manager.getAllProposals();
        assertEquals(proposals.size(), oldProposals.size() + 1);
    }

    @Test
    public void test_D_GetAllProposals() {
        // dependent on test_b
        List<IProposal> allProposals = manager.getAllProposals();
        assertEquals(allProposals.size(), 1);
    }

    @Test
    public void test_B_GetAllProposals() {
        List<IProposal> allProposals = manager.getAllProposals();
        assertThat(allProposals.size(), is(0));
    }

}
