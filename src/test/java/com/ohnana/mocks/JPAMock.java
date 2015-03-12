package com.ohnana.mocks;

import com.ohnana.interfaces.IJPAManager;
import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.IStudent;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.Student;
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
    private final List<IStudent> students;

    public JPAMock() {
        electivesubjects = new ArrayList();
        proposals = new ArrayList();
        teachers = new ArrayList();
        students = new ArrayList();
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

    @Override
    public void insertStudent(IStudent s1) throws Exception {
       students.add(s1);
    }

    @Override
    public List<IStudent> getAllStudents() {
        return students;
    }
}