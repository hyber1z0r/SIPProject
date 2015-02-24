package com.ohnana.model;

import com.ohnana.control.IJPAManager;
import com.ohnana.mocks.JPAMock;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jakobgaardandersen
 */
public class ElectiveSubjectTest {

    public Mockery context = new JUnitRuleMockery();
    
    private IJPAManager manager = new JPAMock();
    
    @Before
    public void setup() {
        
    }
    
    @Test
    public void testElectiveSubject() {
        IProposal proposal = context.mock(IProposal.class);
        ElectiveSubject es = new ElectiveSubject(proposal);
        assertThat(es.getProposal(), is(proposal));
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
