package com.ohnana.model;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;

/**
 *
 * @author jakobgaardandersen
 */
public class ElectiveSubject implements IElectiveSubject {

    private final IProposal proposal;

    public ElectiveSubject(IProposal proposal) {
        this.proposal = proposal;
    }

    public IProposal getProposal() {
        return proposal;
    }

}
