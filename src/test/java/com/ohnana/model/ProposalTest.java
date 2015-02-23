/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ohnana.model;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Filipovic
 */
public class ProposalTest {  
    @Test
    public void testSubjectClass(){
        String title = "Android";
        String description = "Learning about android";
        String teachers = "Peter Lorensen";
        
        Proposal proposal = new Proposal(title, description, teachers);
        
        assertThat(proposal.getTitle(), is(title));
        assertThat(proposal.getDescription(), is(description));
        assertThat(proposal.getTeachers(), is(teachers));
        
        
        
    }
    
    
    
}
