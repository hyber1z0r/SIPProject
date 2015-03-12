package com.ohnana.control;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.IStudent;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.ElectiveSubject;
import com.ohnana.model.Proposal;
import com.ohnana.model.Student;
import com.ohnana.model.Teacher;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import static org.hamcrest.CoreMatchers.is;
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
    public void setup() throws Exception {
        manager = new JPAManager(Persistence.createEntityManagerFactory("com.ohnana_SIPProject_TEST"));
        teachers = new ArrayList() {
            {
                add(new Teacher("Peter Lorensen", "pelo"));
                add(new Teacher("Anders Kalhauge", "aka"));
                add(new Teacher("Tobias Grundtvig", "tog"));
                add(new Teacher("Henrik Hauge", "hau"));
                add(new Teacher("Caroline Simonsen", "chu"));
                add(new Teacher("Lars Mortensen", "lam"));
                add(new Teacher("Palle Bech", "pab"));
                add(new Teacher("Torben Østrup", "tor"));
                add(new Teacher("Jette Kreiner-Møller", "jekm"));
            }
        };
        // insert first 6 teachers, so we can use the other two in another test!
        for (int i = 0; i < 6; i++) {
            manager.insertTeacher(teachers.get(i));
        }
    }

    @Test
    public void testInsertTeacher() throws Exception {
        List<ITeacher> oldTs = manager.getAllTeachers();
        for (int i = 6; i < 9; i++) {
            manager.insertTeacher(teachers.get(i));
        }
        List<ITeacher> ts = manager.getAllTeachers();
        assertEquals(ts.size(), oldTs.size() + 3);
    }

    @Test
    public void testInsertProposal() throws Exception {
        // Getting all teachers, and inserting a new proposal
        List<ITeacher> allTeachers = manager.getAllTeachers();
        List<IProposal> oldProposals = manager.getAllProposals();
        IProposal p1 = new Proposal("Android", "Learn about the android platform", allTeachers.get(0));
        manager.insertProposal(p1);
        List<IProposal> proposals = manager.getAllProposals();
        assertEquals(proposals.size(), oldProposals.size() + 1);
    }

    @Test
    public void testInsertElectiveSubjects() throws Exception {
        // insert new proposal, to make test independent of other test cases
        List<ITeacher> allTeachers = manager.getAllTeachers();
        List<IProposal> oldProposals = manager.getAllProposals();
        IProposal p1 = new Proposal("Android", "Learn about the android platform", allTeachers.get(0));
        manager.insertProposal(p1);

        final List<IProposal> allProposals = manager.getAllProposals();
        List<IElectiveSubject> es = new ArrayList() {
            {
                this.add(new ElectiveSubject(allProposals.get(0)));
            }
        };
        manager.insertElectiveSubjects(es);
    }

    @Test
    public void testGetAllElectiveSubjects() {
        List<IElectiveSubject> allElectiveSubjects = manager.getAllElectiveSubjects();
        assertThat(allElectiveSubjects.size(), is(1));
    }

    @Test
    public void testInsertStudent() throws Exception {
        IStudent s1 = new Student("Damjan Filipovic");
        manager.insertStudent(s1);
    }

    @Test
    public void testGetAllStudents() throws Exception {
        List<IStudent> oldStudents = manager.getAllStudents();
        IStudent s1 = new Student("Damjan Filipovic");
        manager.insertStudent(s1);
        List<IStudent> allStudents = manager.getAllStudents();
        assertThat(allStudents.size(), is(oldStudents.size() + 1));
    }

}
