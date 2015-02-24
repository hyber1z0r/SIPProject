package com.ohnana.model;

/**
 *
 * @author jakobgaardandersen
 */
public class ElectiveSubject {

    private IProposal proposal;

    public ElectiveSubject(IProposal proposal) {
        this.proposal = proposal;
    }

    public IProposal getProposal() {
        return proposal;
    }
    
    

}
