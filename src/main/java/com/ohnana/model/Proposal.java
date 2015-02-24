package com.ohnana.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 @NamedQuery (name = "Proposal.getAll", query = "SELECT p FROM Proposals p")
})
public class Proposal implements IProposal, Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;
    private List<ITeacher> teachers;

    public Proposal() {
    }

    public Proposal(String title, String description, List<ITeacher> teachers) {
        this.title = title;
        this.description = description;
        this.teachers = teachers;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<ITeacher> getTeachers() {
        return teachers;
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
    
    

}
