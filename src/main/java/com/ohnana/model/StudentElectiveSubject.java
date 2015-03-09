/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.model;

import com.ohnana.interfaces.IElectiveSubject;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Filipovic
 */
@Entity
@Table(name = "STUDENT_ELECTIVESUBJECT")
public class StudentElectiveSubject implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StuElePK sepk;
    @Column(name = "PRIORITY")
    @Enumerated(EnumType.STRING)
    private Priority priority;
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)

    private Student student;
    @JoinColumn(name = "ELECTIVESUBJECT_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private IElectiveSubject electiveSubject;

    public StudentElectiveSubject() {
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public IElectiveSubject getElectiveSubject() {
        return electiveSubject;
    }

    public void setElectivesubject(IElectiveSubject electiveSubject) {
        this.electiveSubject = electiveSubject;
    }

    public StuElePK getSepk() {
        return sepk;
    }

    public void setSepk(StuElePK sepk) {
        this.sepk = sepk;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.student);
        hash = 37 * hash + Objects.hashCode(this.electiveSubject);
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
        final StudentElectiveSubject other = (StudentElectiveSubject) obj;
        if (!Objects.equals(this.student, other.student)) {
            return false;
        }
        if (!Objects.equals(this.electiveSubject, other.electiveSubject)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return electiveSubject.toString() + "  " + student.toString();
    }

}
