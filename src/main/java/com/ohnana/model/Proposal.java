package com.ohnana.model;

import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jakobgaardandersen
 */
@Entity
@Table(name = "PROPOSALS")
@NamedQueries({
    @NamedQuery(name = "Proposal.getAll", query = "SELECT p FROM Proposal p")
})

public class Proposal implements IProposal, Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    //@JoinColumn(name = "ProposalID", table = "PROPOSAL_TEACHER")
    private int id;
    
    private String title;
    
    private String description;
    
    @JoinColumn(name = "TEACHER_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ITeacher teacher;

    public Proposal() {
    }

    public Proposal(String title, String description, ITeacher teacher) {
        this.title = title;
        this.description = description;
        this.teacher = teacher;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public ITeacher getTeacher() {
        return teacher;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
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
        final Proposal other = (Proposal) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title;
    }

    
}
