/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.model;

import com.ohnana.control.Facade;
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
 * @author Filipovic
 */
public class ProposalTest {

    public Mockery context = new JUnitRuleMockery();
    private Facade facade;
    private Teacher t1;

    @Before
    public void setup() {
        facade = Facade.getFacade();
        insertStaticTeachers();        
    }

    public void insertStaticTeachers() {
        t1 = new Teacher();
        facade.insertTeacher(t1);
    }

    @Test
    public void testProposalClass() {

        String title = "Android";
        String description = "Learning about android";
        final ITeacher t1 = context.mock(ITeacher.class);
        List<ITeacher> teachers = new ArrayList() {
            {
                add(t1);
            }
        };

        Proposal proposal = new Proposal(title, description, teachers);

        assertThat(proposal.getTitle(), is(title));
        assertThat(proposal.getDescription(), is(description));
        assertThat(proposal.getTeachers(), is(teachers));

    }

    @Test
    public void testInsertProposal() {
        String title = "Android";
        String description = "Learning about android";
        List<ITeacher> teachers = new ArrayList() {
            {
                add(t1);
            }
        };
        facade.insertProposal(title, description, teachers);
    }
    
    @Test
    public void testChooseAllProposal(){
        facade.insertProposal("Math", "Learn to plus and minus", (List<ITeacher>) t1);
        facade.insertProposal("Danish", "Learn the danish food", (List<ITeacher>) t1);
        facade.insertProposal("IT", "Basics in Word and PowerPoint",(List<ITeacher>) t1);
        facade.insertProposal("Swimming", "Learn to swim", (List<ITeacher>) t1);
       
        List<Proposal> allProposals = facade.getAllProposals();
        
        assertTrue(allProposals.size() == 4);
    }
}
