/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.model;

import com.ohnana.interfaces.ITeacher;
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

    @Test
    public void testProposalClass() {
        String title = "Android";
        String description = "Learning about android";
        final ITeacher teacher = context.mock(ITeacher.class);
        List<ITeacher> teachers = new ArrayList() {
            {
                add(teacher);
            }
        };

        Proposal proposal = new Proposal(title, description, teachers);
        assertThat(proposal.getTitle(), is(title));
        assertThat(proposal.getDescription(), is(description));
        assertThat(proposal.getTeachers(), is(teachers));
    }
}
