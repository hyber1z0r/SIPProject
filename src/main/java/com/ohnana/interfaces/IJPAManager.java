package com.ohnana.interfaces;

import java.util.List;

/**
 *
 * @author jakobgaardandersen
 */
public interface IJPAManager {

    void insertProposal(IProposal proposal) throws Exception;

    void insertTeacher(ITeacher teacher) throws Exception;

    void insertElectiveSubjects(List<IElectiveSubject> es) throws Exception;

    List<IProposal> getAllProposals();

    List<ITeacher> getAllTeachers();

    List<IElectiveSubject> getAllElectiveSubjects();

    void insertStudent(IStudent student) throws Exception;

    List<IStudent> getAllStudents();

    void updateStudentSubject(int id, String... subjects) throws Exception;

    void insertSubject(ISavedSubject subject) throws Exception;
}
