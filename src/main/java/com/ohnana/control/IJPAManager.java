package com.ohnana.control;

import com.ohnana.model.IElectiveSubject;
import com.ohnana.model.ITeacher;
import com.ohnana.model.Proposal;
import java.util.List;

/**
 *
 * @author jakobgaardandersen
 */
public interface IJPAManager {
    void insertProposal(Proposal proposal);
    void insertTeacher(ITeacher t1);
    void insertElectiveSubjects(List<IElectiveSubject> es);
}
