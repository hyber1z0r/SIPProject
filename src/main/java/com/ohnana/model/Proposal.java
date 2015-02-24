/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.model;

import java.util.List;

/**
 *
 * @author Filipovic
 */
public class Proposal {
    private String title;
    private String description;
    private List <TeacherInterface> teachers;

    public Proposal(String title, String description, List <TeacherInterface> teachers) {
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

    public List<TeacherInterface> getTeachers() {
        return teachers;
    }
    
    
}
