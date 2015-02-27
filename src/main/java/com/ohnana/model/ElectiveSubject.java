package com.ohnana.model;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jakobgaardandersen
 */
@Entity
@Table(name = "ELECTIVESUBJECTS")
public class ElectiveSubject implements IElectiveSubject, Serializable {

    @Id
    private int id;
    private final IProposal proposal;

    public ElectiveSubject() {
        this(null);
    }

    public ElectiveSubject(IProposal proposal) {
        this.proposal = proposal;
    }

    public IProposal getProposal() {
        return proposal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
