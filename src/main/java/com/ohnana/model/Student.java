/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.model;

import com.ohnana.interfaces.IStudent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Filipovic
 */
@Entity
@Table(name = "STUDENTS")
@NamedQueries({
    @NamedQuery(name = "Student.getAll", query = "SELECT s FROM Student s")
})
public class Student implements IStudent, Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    // liste af første priorities
    @Column(name = "FIRSTPRIORITIES")
    private List<String> firstPrios;
    // liste af anden priorities
    @Column(name = "SECONDPRIORITIES")
    private List<String> secondPrios;

    public Student() {

    }

    public Student(String name) {
        firstPrios = new ArrayList();
        secondPrios = new ArrayList();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addFirstPrio(String name) {
        firstPrios.add(name);
    }

    @Override
    public void addSecondPrio(String name) {
        secondPrios.add(name);
    }

    @Override
    public List<String> getFirstP() {
        return firstPrios;
    }

    @Override
    public List<String> getSecondP() {
        return secondPrios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return name;
    }
}
