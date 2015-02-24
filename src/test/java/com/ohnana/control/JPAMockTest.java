package com.ohnana.control;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.mocks.JPAMock;
import com.ohnana.model.ElectiveSubject;
import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import java.util.ArrayList;
import java.util.List;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

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
        List<ITeacher> teachers = new ArrayList() {
            {
                add(new Teacher());
            }
        };
        IProposal proposal = new Proposal(title, description, teachers);
        manager.insertProposal(proposal);
    }
    
    @Test
    public void testChooseAllProposal(){
        List<ITeacher> teachers = new ArrayList() {
            {
                add(new Teacher());
            }
        };
        IProposal ip1 = new Proposal("Math", "Learn to plus and minus", teachers);
        IProposal ip2 = new Proposal("Danish", "Learn the danish food", teachers);
        IProposal ip3 = new Proposal("IT", "Basics in Word and PowerPoint", teachers);
        IProposal ip4 = new Proposal("Swimming", "Learn to swim", teachers);
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
