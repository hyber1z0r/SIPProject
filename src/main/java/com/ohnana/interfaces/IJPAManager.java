package com.ohnana.interfaces;

import java.util.List;

/**
 *
 * @author jakobgaardandersen
 */
public interface IJPAManager {

    void insertProposal(IProposal proposal);

    void insertTeacher(ITeacher teacher);

    void insertElectiveSubjects(List<IElectiveSubject> es);

    List<IProposal> getAllProposals();
    
    List<ITeacher> getAllTeachers();
    
    void removeTeacher(ITeacher teacher);
    
    List<IElectiveSubject> getAllElectiveSubjects();
}
