package com.ohnana.model;

import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jakobgaardandersen
 */
@Entity
@Table(name = "TEACHERS")
@NamedQueries({
    @NamedQuery(name = "Teacher.getAll", query = "SELECT t FROM Teacher t")
})
public class Teacher implements ITeacher, Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    //@JoinColumn(name = "TeacherID", table = "PROPOSAL_TEACHER")
    private int id;
    
    private String name;
    private String initials;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacherId", fetch = FetchType.LAZY)
    private List<IProposal> proposals;

    public Teacher() {
    }

    public Teacher(String name, String initials) {
        this.name = name;
        this.initials = initials;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInitials() {
        return initials;
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List<IProposal> getProposalList() {
        return proposals;
    }

    public void setProposalList(List<IProposal> proposalList) {
        this.proposals = proposalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name + " (" + initials.toUpperCase() + ")";
    }

}
