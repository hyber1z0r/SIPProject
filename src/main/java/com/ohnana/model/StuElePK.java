package com.ohnana.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author jakobgaardandersen
 */
@Embeddable
public class StuElePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "STUDENT_ID")
    private int studentId;
    @Basic(optional = false)
    @Column(name = "ELECTIVESUBJECT_ID")
    private int electivesubjectId;

    public StuElePK() {
    }

    public StuElePK(int studentId, int electivesubjectId) {
        this.studentId = studentId;
        this.electivesubjectId = electivesubjectId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getElectivesubjectId() {
        return electivesubjectId;
    }

    public void setElectivesubjectId(int electivesubjectId) {
        this.electivesubjectId = electivesubjectId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) studentId;
        hash += (int) electivesubjectId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StuElePK)) {
            return false;
        }
        StuElePK other = (StuElePK) object;
        if (this.studentId != other.studentId) {
            return false;
        }
        if (this.electivesubjectId != other.electivesubjectId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sletmig.StudentElectivesubjectPK[ studentId=" + studentId + ", electivesubjectId=" + electivesubjectId + " ]";
    }
}
