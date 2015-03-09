package com.ohnana.model;

import com.ohnana.control.Facade;
import com.ohnana.control.FacadeTest;
import com.ohnana.interfaces.IProposal;
import static org.hamcrest.CoreMatchers.is;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jakobgaardandersen
 */
public class ElectiveSubjectTest {

    public Mockery context = new JUnitRuleMockery();
    Facade facade = Facade.getFacade();

    @Test
    public void testElectiveSubject() {
        IProposal proposal = context.mock(IProposal.class);
        ElectiveSubject es = new ElectiveSubject(proposal);
        assertThat(es.getProposal(), is(proposal));
    }
    
    @Test
    public void testintesrtElectiveSubject(){
        IProposal proposal = context.mock(IProposal.class);
        ElectiveSubject es = new ElectiveSubject(proposal);
        
    }

}
