package com.ohnana.interfaces;

import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
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
}
