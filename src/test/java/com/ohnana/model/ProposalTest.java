/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.model;

import com.ohnana.interfaces.ITeacher;
import static org.hamcrest.CoreMatchers.is;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Filipovic
 */
public class ProposalTest {

    public Mockery context = new JUnitRuleMockery();

    @Test
    public void testProposalClass() {
        String title = "Android";
        String description = "Learning about android";
        final ITeacher teacher = context.mock(ITeacher.class);

        Proposal proposal = new Proposal(title, description, teacher);
        assertThat(proposal.getTitle(), is(title));
        assertThat(proposal.getDescription(), is(description));
        assertThat(proposal.getTeacher(), is(teacher));
    }
}
