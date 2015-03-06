package com.ohnana.control;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.ElectiveSubject;
import com.ohnana.model.Proposal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;

/**
 *
 * @author jakobgaardandersen
 */
public class Facade {

    private static Facade instance;
    private final JPAManager manager;

    private Facade() {
        manager = new JPAManager(Persistence.createEntityManagerFactory("com.ohnana_SIPProject"));
    }

    public static Facade getFacade() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public void insertProposal(String title, String description, ITeacher teacher) {
        // check args
        IProposal proposal = new Proposal(title, description, teacher);
        manager.insertProposal(proposal);
    }

    public void insertTeacher(ITeacher teacher) {
        // check args
        manager.insertTeacher(teacher);
    }

    public List<IProposal> getAllProposals() {
        return manager.getAllProposals();
    }

    public List<ITeacher> getAllTeachers() {
        return manager.getAllTeachers();
    }

    public void insertElectiveSubjects(List<IProposal> proposals) {
        List<IElectiveSubject> es = new ArrayList();
        for (IProposal proposal : proposals) {
            es.add(new ElectiveSubject(proposal));
        }
        manager.insertElectiveSubjects(es);
    }
    
}
