package com.ohnana.interfaces;

import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import java.util.List;

/**
 *
 * @author jakobgaardandersen
 */
public interface IJPAManager {
    void insertProposal(Proposal proposal);
    void insertTeacher(Teacher t1);
    void insertElectiveSubjects(List<IElectiveSubject> es);
}
