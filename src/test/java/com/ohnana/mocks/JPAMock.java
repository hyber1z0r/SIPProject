package com.ohnana.mocks;

import com.ohnana.control.IJPAManager;
import com.ohnana.model.IElectiveSubject;
import com.ohnana.model.ITeacher;
import com.ohnana.model.Proposal;
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

    public JPAMock() {
        electivesubjects = new ArrayList<>();
    }

    @Override
    public void insertProposal(Proposal proposal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertTeacher(ITeacher t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertElectiveSubjects(List<IElectiveSubject> es) {
        for (IElectiveSubject e : es) {
            electivesubjects.add(e);
        }
    }
    
    public List<IElectiveSubject> getAllElectiveSubjects() {
        return electivesubjects;
    }

}
