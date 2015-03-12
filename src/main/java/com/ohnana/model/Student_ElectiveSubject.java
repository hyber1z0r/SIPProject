/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Filipovic
 */
@Entity
public class Student_ElectiveSubject implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int studentID;
    private int electiveSubjectID;
    private Priority prior;

    public Student_ElectiveSubject(int studentID, int electiveSubjectID, Priority prior) {
        this.studentID = studentID;
        this.electiveSubjectID = electiveSubjectID;
        this.prior = prior;
    }
    
    public Student_ElectiveSubject(){
        
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getElectiveSubjectID() {
        return electiveSubjectID;
    }

    public void setElectiveSubjectID(int electiveSubjectID) {
        this.electiveSubjectID = electiveSubjectID;
    }

    public Priority getPrior() {
        return prior;
    }

    public void setPrior(Priority prior) {
        this.prior = prior;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (!(object instanceof Student_ElectiveSubject)) {
            return false;
        }
        Student_ElectiveSubject other = (Student_ElectiveSubject) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ohnana.model.Student_ElectiveSubject[ id=" + id + " ]";
    }
    
}
