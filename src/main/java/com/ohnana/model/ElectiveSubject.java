package com.ohnana.model;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private IProposal proposal;

    public ElectiveSubject() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ElectiveSubject other = (ElectiveSubject) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
