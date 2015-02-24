package com.ohnana.control;

import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.Proposal;
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
    
    public void insertProposal(String title, String description, List<ITeacher> teachers) {
        // check args
        IProposal proposal = new Proposal(title, description, teachers);
        manager.insertProposal(proposal);
    }

    public void insertTeacher(ITeacher teacher) {
        manager.insertTeacher(teacher);
    }
    
    public List<IProposal> getAllProposals()
    {
        return manager.getAllProposals();
    }

}
