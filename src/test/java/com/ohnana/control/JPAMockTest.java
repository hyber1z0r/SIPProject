package com.ohnana.control;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.mocks.JPAMock;
import com.ohnana.model.ElectiveSubject;
import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import java.util.ArrayList;
import java.util.List;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jakobgaardandersen
 */
public class JPAMockTest {
    
    private IJPAManager manager;
    public Mockery context;

    public JPAMockTest() {
        manager = new JPAMock();
        context = new JUnitRuleMockery();
    }

    @Test
    public void testInsertProposal() {
        String title = "Android";
        String description = "Learning about android";
        final ITeacher teacher = context.mock(ITeacher.class);
        IProposal proposal = new Proposal(title, description, teacher);
        manager.insertProposal(proposal);
    }
    
    @Test
    public void testChooseAllProposal(){
        ITeacher teacher = new Teacher();

        IProposal ip1 = new Proposal("Math", "Learn to plus and minus", teacher);
        IProposal ip2 = new Proposal("Danish", "Learn the danish food", teacher);
        IProposal ip3 = new Proposal("IT", "Basics in Word and PowerPoint", teacher);
        IProposal ip4 = new Proposal("Swimming", "Learn to swim", teacher);
        manager.insertProposal(ip1);
        manager.insertProposal(ip2);
        manager.insertProposal(ip3);
        manager.insertProposal(ip4);
       
        List<IProposal> allProposals = manager.getAllProposals();
        
        assertTrue(allProposals.size() == 4);
    }
    
    @Test
    public void insertElectiveSubject() {
        IProposal proposal = context.mock(IProposal.class);
        final ElectiveSubject es = new ElectiveSubject(proposal);
        List<IElectiveSubject> electives = new ArrayList() {
            {
                add(es);
            }
        };
        manager.insertElectiveSubjects(electives);
        
    }
    
}
