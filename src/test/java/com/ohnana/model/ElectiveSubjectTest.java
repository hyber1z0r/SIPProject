package com.ohnana.model;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.IJPAManager;
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
   
    
    @Test
    public void testElectiveSubject() {
        IProposal proposal = context.mock(IProposal.class);
        ElectiveSubject es = new ElectiveSubject(proposal);
        assertThat(es.getProposal(), is(proposal));
    }
    
    
    
    

}
