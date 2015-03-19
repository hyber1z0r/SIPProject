package com.ohnana.model;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.ISavedSubject;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jakobgaardandersen
 */
@Entity
public class SavedSubject implements ISavedSubject, Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Day 1")
    private List<IElectiveSubject> day1;
    @Column(name = "Day 2")
    private List<IElectiveSubject> day2;

    public SavedSubject() {
    }

    public SavedSubject(List<IElectiveSubject> day1, List<IElectiveSubject> day2) {
        this.day1 = day1;
        this.day2 = day2;
    }

    @Override
    public List<IElectiveSubject> getDay1() {
        return day1;
    }

    @Override
    public List<IElectiveSubject> getDay2() {
        return day2;
    }
    
    @Override
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
        if (!(object instanceof SavedSubject)) {
            return false;
        }
        SavedSubject other = (SavedSubject) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ohnana.model.SavedSubjects[ id=" + id + " ]";
    }

}
