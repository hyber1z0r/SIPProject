package com.ohnana.mocks;

import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jakobgaardandersen
 */
public class JPAMock implements IJPAManager {

    private final List<IElectiveSubject> electivesubjects;
    private final List<IProposal> proposals;
    private final List<ITeacher> teachers;

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
    public List<IElectiveSubject> getAllElectiveSubjects() {
        return electivesubjects;
    }
}