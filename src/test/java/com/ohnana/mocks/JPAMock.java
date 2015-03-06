package com.ohnana.mocks;

import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jakobgaardandersen
 */
public class JPAMock implements IJPAManager {

    private List<IElectiveSubject> electivesubjects;
    private List<IProposal> proposals;
    private List<ITeacher> teachers;

    public JPAMock() {
        electivesubjects = new ArrayList();
        proposals = new ArrayList();
        teachers = new ArrayList();
    }

    @Override
    public void insertProposal(IProposal proposal) {
        proposals.add(proposal);
    }

    @Override
    public void insertTeacher(ITeacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void insertElectiveSubjects(List<IElectiveSubject> es) {
        for (IElectiveSubject e : es) {
            electivesubjects.add(e);
        }
    }

    @Override
    public List<IProposal> getAllProposals() {
        return proposals;
    }

    @Override
    public List<ITeacher> getAllTeachers() {
        return teachers;
    }

    @Override
    public void removeTeacher(ITeacher teacher) {
        for (ITeacher t : teachers) {
            if(t == teacher) teachers.remove(t);
        }
    }

    @Override
    public List<IElectiveSubject> getAllElectiveSubjects() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
