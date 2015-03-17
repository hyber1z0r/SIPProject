package com.ohnana.control;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.IStudent;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.mocks.JPAMock;
import com.ohnana.model.ElectiveSubject;
import com.ohnana.model.Proposal;
import com.ohnana.model.Student;
import com.ohnana.model.Teacher;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jakobgaardandersen
 */
public class JPAMockTest {

    private final IJPAManager manager;
    public Mockery context;

    public JPAMockTest() {
        manager = new JPAMock();
        context = new JUnitRuleMockery();
    }

    @Test
    public void testInsertProposal() throws Exception {
        String title = "Android";
        String description = "Learning about android";
        final ITeacher teacher = context.mock(ITeacher.class);
        IProposal proposal = new Proposal(title, description, teacher, "Damjan Filipovic");
        manager.insertProposal(proposal);
    }

    @Test
    public void testGetAllProposal() throws Exception {
        ITeacher teacher = new Teacher();
        IProposal ip1 = new Proposal("Math", "Learn to plus and minus", teacher, "Damjan Filipovic");
        IProposal ip2 = new Proposal("Danish", "Learn the danish food", teacher, "Damjan Filipovic");
        IProposal ip3 = new Proposal("IT", "Basics in Word and PowerPoint", teacher, "Damjan Filipovic");
        IProposal ip4 = new Proposal("Swimming", "Learn to swim", teacher, "Damjan Filipovic");
        manager.insertProposal(ip1);
        manager.insertProposal(ip2);
        manager.insertProposal(ip3);
        manager.insertProposal(ip4);

        List<IProposal> allProposals = manager.getAllProposals();

        assertTrue(allProposals.size() == 4);
    }

    @Test
    public void testInsertTeacher() throws Exception {
        ITeacher teacher = new Teacher("Anders Kalhauge", "aka");
        manager.insertTeacher(teacher);
    }

    @Test
    public void testGetAllTeachers() throws Exception {
        ITeacher teacher = new Teacher("Anders Kalhauge", "aka");
        manager.insertTeacher(teacher);
        List<ITeacher> allTeachers = manager.getAllTeachers();
        assertEquals(allTeachers.size(), 1);
    }

    @Test
    public void testInsertElectiveSubject() throws Exception {
        IProposal proposal = context.mock(IProposal.class);
        final ElectiveSubject es = new ElectiveSubject(proposal);
        List<IElectiveSubject> electives = new ArrayList() {
            {
                add(es);
            }
        };
        manager.insertElectiveSubjects(electives);

    }

    @Test
    public void testGetAllElectiveSubjects() throws Exception {
        IProposal proposal = context.mock(IProposal.class);
        final ElectiveSubject es = new ElectiveSubject(proposal);
        List<IElectiveSubject> electives = new ArrayList() {
            {
                add(es);
                add(es);
                add(es);
            }
        };
        manager.insertElectiveSubjects(electives);
        List<IElectiveSubject> allElectiveSubjects = manager.getAllElectiveSubjects();
        assertEquals(allElectiveSubjects.size(), 3);
    }

    @Test
    public void testInsertStudent() throws Exception {
        IStudent student = new Student("Damjan Filipovic");
        manager.insertStudent(student);
    }

    @Test
    public void testGetAllStudents() throws Exception {
        List<IStudent> oldStudents = manager.getAllStudents();
        int oldSize = oldStudents.size();
        IStudent student = new Student("Damjan Filipovic");
        manager.insertStudent(student);
        List<IStudent> allStudents = manager.getAllStudents();

        assertThat(allStudents.size(), is(oldSize + 1));
    }
}
